package module6.task3.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//Задание 3: создайте клиент-серверное приложение “Архив”.
//Общие требования к заданию:
//• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
//• Клиент, в зависимости от прав, может запросить дело на просмотр, внести в него изменения, или создать новое дело.
//Требования к коду лабораторной работы:
//• Для реализации сетевого соединения используйте сокеты.
//• Формат хранения данных на сервере – xml-файлы.
public class RunnerClient {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Socket clientSocket = new Socket("192.168.100.51", 8000);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        boolean authorization = false;
        boolean adminRights = false;
        boolean clientGoOut = false;

        while (!clientGoOut) {

            while (!authorization) {
                System.out.println("1. Авторизоваться");
                System.out.println("2. Зарегистрироваться");
                int choiceAuthorization = scanner.nextInt();
                scanner.nextLine();

                switch (choiceAuthorization) {
                    case 1:
                        writer.write("авторизация");
                        writer.newLine();

                        System.out.println("Введите логин");
                        String login = scanner.nextLine();
//                    String login = "5555"; admin

                        System.out.println("Введите пароль");
                        String password = scanner.nextLine();
//                     password = "5555"; admin

                        writer.write(login);
                        writer.newLine();

                        writer.write(password);
                        writer.newLine();
                        writer.flush();

                        authorization = Boolean.parseBoolean(reader.readLine());
                        adminRights = Boolean.parseBoolean(reader.readLine());

                        if (adminRights && authorization) {
                            Menu.menuForAdmin();
                        }
                        if (!adminRights && authorization) {
                            Menu.menuForUsers();
                        }
                        if (!authorization) {
                            System.out.println("Вы не зарегестрированный пользователь");
                            // break;
                        }
                        break;

                    case 2:
                        writer.write("регистрация");
                        writer.newLine();

                        System.out.println("Введите логин");
                        login = scanner.nextLine();

                        System.out.println("Введите пароль");
                        password = scanner.nextLine();

                        writer.write(login);
                        writer.newLine();

                        writer.write(password);
                        writer.newLine();

                        writer.flush();
                        System.out.println("Теперь пройдите авторизацию");
                        break;

                    default:
                        System.out.println("1. Авторизоваться");
                        System.out.println("2. Зарегистрироваться");
                }
            }

            boolean inCase = true;
            if (adminRights) {           //для администратора
                while (inCase) {

                    System.out.println("Введите команду");
                    int scannerForAdmin = scanner.nextInt();
                    scanner.nextLine();

                    switch (scannerForAdmin) {
                        case 1:
                            writer.write("посмотреть всех студентов");
                            writer.newLine();
                            writer.flush();
                            String str;
                            while ((str = reader.readLine()) != null) {
                                if (str.equals("exit")) {
                                    break;
                                }
                                System.out.println(str);
                            }
                            break;

                        case 2:
                            System.out.println("Введите фамилию");
                            String surname = scanner.nextLine();

                            System.out.println("Введите имя");
                            String firstName = scanner.nextLine();

                            System.out.println("Введите отчество");
                            String additionalName = scanner.nextLine();

                            System.out.println("Введите дату рождения");
                            String birthday = scanner.nextLine();

                            System.out.println("Введите личное дело");
                            String studentCase = scanner.nextLine();

                            writer.write("добавить студента");
                            writer.newLine();

                            writer.write(surname);
                            writer.newLine();

                            writer.write(firstName);
                            writer.newLine();

                            writer.write(additionalName);
                            writer.newLine();

                            writer.write(birthday);
                            writer.newLine();

                            writer.write(studentCase);
                            writer.newLine();

                            writer.flush();
                            break;

                        case 3:
                            System.out.println("Введите id");
                            String id = scanner.nextLine();

                            System.out.println("Что хотите изменить?");
                            Menu.menuForRedaction();
                            String whereRedactionField = scanner.nextLine();

                            System.out.println("На что изменить?");
                            String newField = scanner.nextLine();

                            System.out.println("id " + id);
                            System.out.println("whereRedactionField " + whereRedactionField);
                            System.out.println("newField " + newField);

                            writer.write("редактировать студента");
                            writer.newLine();

                            writer.write(id);
                            writer.newLine();

                            writer.write(whereRedactionField);
                            writer.newLine();

                            writer.write(newField);
                            writer.newLine();

                            writer.flush();

                            // str = reader.readLine();
                            while ((str = reader.readLine()) != null) {
                                if (str.equals("exit")) {
                                    break;
                                }
                                System.out.println(str);
                            }
//                            if (str.equals("exit")) {
//                                break;
//                            }
                            break;

                        case 4:
                            System.out.println("Введите id, который нужно найти: ");
                            String readerId = scanner.nextLine();

                            writer.write("поиск по id");
                            writer.newLine();

                            writer.write(readerId);
                            writer.newLine();

                            writer.flush();
                            System.out.println(reader.readLine());
                            break;

                        case 5:
                            System.out.println("Введите фамилию, которую нужно найти: ");

                            String readerSurname = scanner.nextLine();

                            writer.write("поиск студента по фамилии");
                            writer.newLine();

                            writer.write(readerSurname);
                            writer.newLine();

                            writer.flush();

                            while ((str = reader.readLine()) != null) {
                                if (str.equals("exit")) {
                                    break;
                                }
                                System.out.println(str);
                            }
                            break;

                        case 6:
                            writer.write("выход");
                            writer.newLine();
                            writer.flush();

                            inCase = false;
                            writer.close();
                            reader.close();
                            clientSocket.close();
                            scanner.close();
                            break;

                        default:
                            System.out.println("Повторите команду");
                            break;
                    }
                }
            }
            if (!adminRights) {     //для пользователя
                while (inCase) {

                    System.out.println("\nВведите команду");
                    int scannerForUser = scanner.nextInt();
                    scanner.nextLine();

                    switch (scannerForUser) {
                        case 1:
                            writer.write("посмотреть всех студентов");
                            writer.newLine();
                            writer.flush();
                            String str;
                            while ((str = reader.readLine()) != null) {
                                if (str.equals("exit")) {
                                    break;
                                }
                                System.out.println(str);
                            }
                            break;

                        case 2:
                            System.out.println("Введите id, который нужно найти: ");
                            int readerId = scanner.nextInt();

                            writer.write("поиск по id");
                            writer.newLine();

                            writer.write(readerId);
                            writer.newLine();

                            writer.flush();
                            System.out.println(reader.readLine());
                            break;

                        case 3:
                            System.out.println("Введите фамилию, которую нужно найти: ");
                            Scanner scanner2 = new Scanner(System.in);

                            String readerSurname = scanner2.nextLine();

                            writer.write("поиск студента по фамилии");
                            writer.newLine();

                            writer.write(readerSurname);
                            writer.newLine();

                            writer.flush();

                            while ((str = reader.readLine()) != null) {
                                if (str.equals("exit")) {
                                    break;
                                }
                                System.out.println(str);
                            }
                            break;

                        case 4:
                            writer.write("выход");
                            writer.newLine();
                            writer.flush();

                            inCase = false;
                            writer.close();
                            reader.close();
                            clientSocket.close();
                            scanner.close();
                            break;

                        default:
                            System.out.println("Повторите команду");
                            break;
                    }
                }
            }
            clientGoOut = true;
            System.out.println("Вы отключились от сервера");
        }
    }
}