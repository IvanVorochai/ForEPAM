package module6.task2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

//Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками в Блокноте. Каждая Заметка это:
// Заметка (тема, дата создания, e-mail, сообщение).
//Общие пояснения к практическому заданию.
//• В начале работы приложения данные должны считываться из файла, в конце работы – сохраняться в файл.
//• У пользователя должна быть возможность найти запись по любому параметру или по группе параметров (группу параметров
// можно определить самостоятельно), получить требуемые записи в отсортированном виде, найти записи, текстовое поле
// которой содержит определенное слово, а также добавить новую запись.
//• Особое условие: поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных выражений.
//• Особое условие: проверку введенной информации на валидность должен осуществлять код, непосредственно добавляющий
// информацию.
public class Runner {
    public static void main(String[] args) throws IOException {
        String sep = File.separator;
        String path = ("c:" + sep + "Users" + sep + "User" + sep + "IdeaProjects" + sep + "untitled" + sep + "src" +
                sep + "module6" + sep + "task2" + sep + "notePad.txt");
        List<Note> noteList = NotePadUtil.useReader(path);  //данные считываются из файла в начале
        for (Note note : noteList) {                        //
            System.out.println(note);                       //
        }

        while (true) {
            System.out.println("\nВыберите интересующий пункт: ");
            System.out.println("1. добавить заметку.");
            System.out.println("2. поиск.");
            System.out.println("3. поиск по теме + mail.");
            System.out.println("4. поиск по теме + дата.");
            System.out.println("5. выход.\n");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 5) {
                break;
            }
            switch (choice) {

                case 1:
                    NotePadUtil.useWriter(path, addNote());
                    break;
                case 2:
                    NotePadUtil.findNote(noteList, findSymbol());
                    break;
                case 3:
                    findTopicEmail(noteList);
                    break;
                case 4:
                    findTopicDate(noteList);
                    break;
            }
        }
    }

    public static Note addNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Тема заметки");
        String topic = scanner.next();
        System.out.println("какой mail?");
        String mail = scanner.next();
        System.out.println("текс заметки");
        String message = scanner.next();

        return new Note(topic, mail, message);
    }

    public static String findSymbol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("поиск по символам. введите символы: ");
        return scanner.next();
    }

    public static List<Note> findTopicEmail(List<Note> noteList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите текс для поиска по теме (ничего не вводите для поиска только по mail)");
        String topic3 = scanner.nextLine();
        System.out.println("введите текс для поиска по mail (ничего не вводите для поиска только по теме)");
        String mail3 = scanner.nextLine();

        System.out.println("Выберите 1 или 2");
        System.out.println("1. сортировка темы по алфавиту");
        System.out.println("2. сортировка-реверс темы по алфавиту");

        int i3 = scanner.nextInt();
        if (i3 != 1 && i3 != 2) {
            i3 = 1;
        }
        return NotePadUtil.findNoteByTopicAndEmail(noteList, topic3, mail3, i3);
    }

    public static List<Note> findTopicDate(List<Note> noteList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите текс для поиска по теме (ничего не вводите для поиска только по дате)");
        String topic4 = scanner.nextLine();
        System.out.println("введите дату \"yyyy-MM-dd'T'HH:mm:ss\" (ничего не вводите для поиска только по теме)");
        String date = scanner.nextLine();

        System.out.println("выберите 1, 2, 3 или 4");
        System.out.println("1. сортировка темы по алфавиту");
        System.out.println("2. сортировка-реверс темы по алфавиту");
        System.out.println("3. сортировка текста по дате");
        System.out.println("4. сортировка-реверс текста по дате");

        int i4 = scanner.nextInt();
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            i4 = 1;
        }
        return NotePadUtil.findNoteByTopicAndDate(noteList, topic4, date, i4);
    }
}
//"yyyy-MM-dd'T'HH:mm:ss"
