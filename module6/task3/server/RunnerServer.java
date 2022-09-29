package module6.task3.server;

import module6.task3.server.bean.Account;
import module6.task3.server.bean.Student;
import module6.task3.server.util.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 3: создайте клиент-серверное приложение “Архив”.
//Общие требования к заданию:
//• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
//• Клиент, в зависимости от прав, может запросить дело на просмотр, внести в него изменения, или создать новое дело.
//Требования к коду лабораторной работы:
//• Для реализации сетевого соединения используйте сокеты.
//• Формат хранения данных на сервере – xml-файлы.
public class RunnerServer {
    static String pathStudents = "c:\\Users\\User\\IdeaProjects\\untitled\\src\\module6\\task3\\server\\xmlFiles\\allStudentList.xml";
    static String pathAccounts = "c:\\Users\\User\\IdeaProjects\\untitled\\src\\module6\\task3\\server\\xmlFiles\\accounts.xml";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XMLStreamException {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);     //создание сокета
            System.out.println("Сервер подключен...");
            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();        //прослушивание порта
                    System.out.println("Клиент подключен...");

                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                    boolean connection = true;
                    while (connection) {

                        String command = reader.readLine();
                        System.out.println("command " + command);

                        switch (command) {

                            case "регистрация":
                                String login = reader.readLine();
                                String password = reader.readLine();
                                AccountWriter.xmlWriteNewAccount(pathAccounts, new Account(false, login, password));
                                break;

                            case "авторизация":
                                login = reader.readLine();
                                password = reader.readLine();
                                List<Account> accountList = AccountReader.xmlParser(pathAccounts);

                                Account currentUser = checkAccount(accountList, login, password);

                                if (currentUser != null) {
                                    writer.write("true");
                                    writer.newLine();
                                    writer.write(String.valueOf(currentUser.isAdmin()));
                                    writer.newLine();
                                } else {
                                    writer.write("false");
                                    writer.newLine();
                                    writer.write("false");
                                    writer.newLine();
                                }
                                writer.flush();
                                break;

                            case "посмотреть всех студентов":
                                List<Student> studentList = StudentReader.xmlParser(pathStudents);
                                for (Student student : studentList) {
                                    writer.write(student.toString());
                                    writer.newLine();
                                }

                                writer.write("exit");
                                writer.newLine();
                                writer.flush();
                                break;

                            case "добавить студента":
                                String surname = reader.readLine();
                                String firstName = reader.readLine();
                                String additionalName = reader.readLine();
                                String birthday = reader.readLine();
                                String studentCase = reader.readLine();
                                StudentWriter.xmlWriteNewStudent(pathStudents, new Student(surname, firstName,
                                        additionalName, birthday, studentCase));
                                break;

                            case "редактировать студента":
                                String id = reader.readLine();
                                String whereRedactionField = reader.readLine();
                                String newField = reader.readLine();

                                studentList = StudentRedaction.xmlRedaction(pathStudents, Integer.parseInt(id),
                                        Integer.parseInt(whereRedactionField), newField);

                                for (Student student : studentList) {
                                    writer.write(student.toString());
                                    writer.newLine();
                                }

                                writer.write("exit");
                                writer.newLine();
                                writer.flush();
                                break;

                            case "поиск по id":
                                String readId = reader.readLine();
                                Student studentId = StudentReader.xmlParserId(pathStudents, Long.parseLong(readId));

                                if (studentId != null) {
                                    writer.write(studentId.toString());
                                    System.out.println(studentId);
                                }
                                writer.newLine();
                                writer.flush();
                                break;

                            case "поиск студента по фамилии":
                                String readerSurname = reader.readLine().toLowerCase();
                                System.out.println(readerSurname);

                                studentList = StudentReader.xmlParser(pathStudents);

                                Pattern pattern = Pattern.compile("[\\wа-яА-Я]*" + readerSurname + "[\\wа-яА-Я]*");

                                for (Student student : studentList) {
                                    Matcher matcher = pattern.matcher(student.getSurname().toLowerCase());
                                    if (matcher.find()) {
                                        writer.write(student.toString());
                                        writer.newLine();
                                        System.out.println(student);
                                    }
                                }

                                writer.write("exit");
                                writer.newLine();
                                writer.flush();
                                break;

                            case "выход":
                                System.out.println("Пользователь " + " отсоединился");
                                connection = false;
                                break;

                            default:
                                studentList = StudentReader.xmlParser(pathStudents);
                                for (Student student : studentList) {
                                    writer.write(String.valueOf(student));
                                    writer.newLine();
                                }
                                writer.flush();
                                break;
                        }
                    }

                } catch (Exception exception) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static Account checkAccount(List<Account> accountList, String login, String password) {
        for (Account account : accountList) {
            if (account.getLogin().equals(login) && account.getPassword().equals(password)) {
                return account;
            }
        }
        return null;
    }
}

