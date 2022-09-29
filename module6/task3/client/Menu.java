package module6.task3.client;

public class Menu {
    public static void menuForUsers() {
        System.out.println("1. посмотреть всех студентов");
        System.out.println("2. поиск студента по id");
        System.out.println("3. поиск студента по фамилии");
        System.out.println("4. выход");
    }

    public static void menuForAdmin() {
        System.out.println("1. посмотреть всех студентов");
        System.out.println("2. добавить студента");
        System.out.println("3. редактировать студента");
        System.out.println("4. поиск студента по id");
        System.out.println("5. поиск студента по фамилии");
        System.out.println("6. выход");
    }

    public static void menuForRedaction() {
        System.out.println("1. изменить фамилия");
        System.out.println("2. изменить имя");
        System.out.println("3. изменить отчество");
        System.out.println("4. изменить дату рождения");
        System.out.println("5. личное дело");
        System.out.println("6. выход");
    }
}
