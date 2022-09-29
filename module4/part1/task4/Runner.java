package module4.part1.task4;

import java.util.Arrays;
import java.util.Scanner;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.
public class Runner {
    public static void main(String[] args) {

        int n = 5;
        Train[] train = new Train[n];
        Scanner scanner = new Scanner(System.in);

        train[0] = new Train("Gomel", "Minsk", 366, "13:00");
        train[1] = new Train("Gomel", "Minsk", 368, "17:05");
        train[2] = new Train("Minsk", "Gomel", 500, "19.00");
        train[3] = new Train("Gomel", "Minsk", 370, "19:05");
        train[4] = new Train("Minsk", "Gomel", 250, "22:10");

        while (true) {
            System.out.println("\nВыберите пункт меню: ");
            System.out.println("1. сортировка по номерам поездов.");
            System.out.println("2. вывода информации о поезде по номеру.");
            System.out.println("3. сортировка по пункту назначения.");
            System.out.println("4. вывод всех поездов.");
            System.out.println("5. выход.");

            int choice = scanner.nextInt();
            if (choice == 5) {
                break;
            }

            switch (choice) {
                case 1: {
                    sortTrainByNumbers(train);
                    break;
                }
                case 2: {
                    informationAboutTrain(train);
                    break;
                }
                case 3: {
                    sortByDestination(train);
                    break;
                }
                case 4: {
                    printTrains(train);
                    break;
                }
            }
        }
    }

    private static void printTrains(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            System.out.print(i + ". ");
            System.out.println(trains[i]);
        }
    }

    private static void sortTrainByNumbers(Train[] train) {
        Arrays.sort(train, new NumberComparator());
        printTrains(train);
    }

    private static void informationAboutTrain(Train[] train) {
        System.out.println("Введите номер поезда: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfTrain = scanner.nextInt();

        for (int i = 0; i < train.length; i++) {
            if (numberOfTrain == train[i].getNumberOfTrain()) {
                System.out.println(train[i]);
                break;
            } else {
                if (numberOfTrain != train[i].getNumberOfTrain() && i == train.length - 1) {
                    System.out.println("Поездов с такими номерами нет");
                }
            }
        }
    }

    private static void sortByDestination(Train[] train) {
        Arrays.sort(train, new EndPlaceAndTimeComparator());
        printTrains(train);
    }
}
