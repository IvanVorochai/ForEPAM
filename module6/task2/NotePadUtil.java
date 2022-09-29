package module6.task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotePadUtil {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public static boolean checkValidEmailAddress(String emailAddress) {
        Pattern pattern = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|" +
                "\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|" +
                "\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|" +
                "\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|" +
                "1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|" +
                "\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.find();
    }

    public static void useWriterList(String path, List<Note> noteList) throws IOException {
        FileWriter fw = new FileWriter(path, false);
        for (Note note : noteList) {
            if (checkValidEmailAddress(note.getEmailAddress()))
                fw.write(note + "\n");
            else {
                System.out.println("некорректный email");
                break;
            }
        }
        fw.close();
    }

    public static void useWriter(String path, Note note) throws IOException {
        FileWriter fw = new FileWriter(path, true);

        if (checkValidEmailAddress(note.getEmailAddress())) {
            fw.write(note + "\n");
            System.out.println("Добавлена новая заметка");
        } else {
            System.out.println("некорректный email");
        }
        fw.close();
    }


    public static List<Note> useReader(String path) throws IOException {
        List<Note> noteList = new ArrayList<>();

        FileReader fr = new FileReader(path);
        Scanner scanner = new Scanner(fr);

        while (scanner.hasNextLine()) {
            List<String> str = List.of(scanner.nextLine().split(";"));

            Note note = new Note();
            note.setTopic(str.get(0));
            note.setEmailAddress(str.get(1));
            note.setMessage(str.get(2));
            LocalDateTime time = LocalDateTime.parse(str.get(3), formatter);
            note.setDateOfCreate(time);

            noteList.add(note);
        }
        fr.close();
        return noteList;
    }

    public static void findNote(List<Note> noteList, String symbol) {
        Pattern pattern = Pattern.compile(symbol.toLowerCase());

        for (Note note : noteList) {
            Matcher matcher1 = pattern.matcher(note.getTopic().toLowerCase());
            Matcher matcher2 = pattern.matcher(note.getMessage().toLowerCase());
            if (matcher1.find() || matcher2.find()) {
                System.out.println(note);
            }
        }
    }

    public static List<Note> findNoteByTopicAndDate(List<Note> noteList, String topicSymbol, String dateSymbol, int i) {
        List<Note> forSortList = new ArrayList<>();
        Pattern pattern1 = Pattern.compile(topicSymbol);
        Pattern pattern2 = Pattern.compile(String.valueOf(dateSymbol));

        for (Note note : noteList) {
            Matcher matcher1 = pattern1.matcher(note.getTopic().toLowerCase());
            Matcher matcher2 = pattern2.matcher(note.getDateOfCreate().format(formatter));

            if (matcher1.find() && matcher2.find()) {
                forSortList.add(note);
                //System.out.println(note);
            }
        }
        if (i == 1) {
            compareByAlphabet(forSortList);
            for (Note note : forSortList) {
                System.out.println(note);
            }
        }
        if (i == 2) {
            compareByAlphabetRevers(forSortList);
            for (Note note : forSortList) {
                System.out.println(note);
            }
        }
        if (i == 3) {
            compareByTime(forSortList);
            for (Note note : forSortList) {
                System.out.println(note);
            }
        }
        if (i == 4) {
            compareByTimeRevers(forSortList);
            for (Note note : forSortList) {
                System.out.println(note);
            }
        }
        return forSortList;
    }

    public static List<Note> findNoteByTopicAndEmail(List<Note> noteList, String topicSymbol, String email, int i) {
        List<Note> forSortList = new ArrayList<>();
        Pattern pattern1 = Pattern.compile(topicSymbol);
        Pattern pattern2 = Pattern.compile(email);

        for (Note note : noteList) {
            Matcher matcher1 = pattern1.matcher(note.getTopic().toLowerCase());
            Matcher matcher2 = pattern2.matcher(note.getEmailAddress());

            if (matcher1.find() && matcher2.find()) {
                forSortList.add(note);
                //System.out.println(note);
            }
        }
        if (i == 1) {
            compareByAlphabet(forSortList);
            for (Note note : forSortList) {
                System.out.println(note);
            }
        }
        if (i == 2) {
            compareByAlphabetRevers(forSortList);
            for (Note note : forSortList) {
                System.out.println(note);
            }
        }
        return forSortList;
    }

    public static void compareByAlphabet(List<Note> noteList) {
        Collections.sort(noteList, new Comparator<Note>() {
            @Override
            public int compare(Note o1, Note o2) {
                int result = o1.getTopic().compareToIgnoreCase(o2.getTopic());
                if (result == 0) {
                    return o1.getEmailAddress().compareTo(o2.getEmailAddress());
                }
                return result;
            }
        });
    }

    public static void compareByAlphabetRevers(List<Note> noteList) {
        Collections.sort(noteList, new Comparator<Note>() {
            @Override
            public int compare(Note o1, Note o2) {
                int result = o2.getTopic().compareToIgnoreCase(o1.getTopic());
                if (result == 0) {
                    return o2.getEmailAddress().compareTo(o1.getEmailAddress());
                }
                return result;
            }
        });
    }

    public static void compareByTimeRevers(List<Note> noteList) {
        Collections.sort(noteList, new Comparator<Note>() {
            @Override
            public int compare(Note o1, Note o2) {
                int result = o2.getDateOfCreate().compareTo(o1.getDateOfCreate());
                if (result == 0) {
                    return o2.getTopic().compareToIgnoreCase(o1.getTopic());
                }
                return result;
            }
        });
    }

    public static void compareByTime(List<Note> noteList) {
        Collections.sort(noteList, new Comparator<Note>() {
            @Override
            public int compare(Note o1, Note o2) {
                int result = o1.getDateOfCreate().compareTo(o2.getDateOfCreate());
                if (result == 0) {
                    return o1.getTopic().compareToIgnoreCase(o2.getTopic());
                }
                return result;
            }
        });
    }
}