package module6.task1.util;

import module6.task1.bean.Book;
import module6.task1.bean.User;

import java.io.*;
import java.util.*;

public class FileReaderAndWriter {
    public static String catalogPath = "c:\\Users\\User\\IdeaProjects\\untitled\\src\\module6\\task1\\resources\\catalog.txt";
    public static String userPath = "c:\\Users\\User\\IdeaProjects\\untitled\\src\\module6\\task1\\resources\\user.txt";

    public static Set<User> getUserFromFile() throws FileNotFoundException {
        File file = new File(userPath);
        Scanner scanner = new Scanner(file);
        Set<User> userSet = new HashSet<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("//")) {
                continue;
            } else {
                List<String> lineList = Arrays.asList(line.split(";"));
                User user = new User();
                user.setLogin(lineList.get(0));
                user.setPassword(lineList.get(1));
                user.setAdministrator(Boolean.parseBoolean(lineList.get(2)));
                user.setEmail(lineList.get(2));
                userSet.add(user);
            }
        }
        return userSet;
    }

    public static Set<Book> getBookFromFile() throws FileNotFoundException {
        File file = new File(catalogPath);
        Scanner scanner = new Scanner(file);
        Set<Book> bookSet = new HashSet<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("//") || line.length() == 0) {
                continue;
            } else {
                List<String> lineList = Arrays.asList(line.split(";"));
                Book book = new Book();
                book.setNameBook(lineList.get(0));
                book.setAuthor(lineList.get(1));
                book.setIsbn(lineList.get(2));
                book.setDescription(lineList.get(3));
                book.setYearOfPublishing(Integer.parseInt(lineList.get(4)));
                book.setNumberOfPage(Integer.parseInt(lineList.get(5)));
                book.setPublishing(lineList.get(6));
                book.seteBook(Boolean.parseBoolean(lineList.get(7)));
                bookSet.add(book);
            }
        }
        Set<Book> books = new HashSet<>(bookSet);
        return books;
    }

    //запись книги в конец каталога
    public static void addBookInFile(Book book) throws IOException {
        FileWriter fileWriter = new FileWriter(catalogPath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        bufferedWriter.write(book.getNameBook() + ";");
        bufferedWriter.write(book.getAuthor() + ";");
        bufferedWriter.write(book.getIsbn() + ";");
        bufferedWriter.write(book.getDescription() + ";");
        bufferedWriter.write(book.getYearOfPublishing() + ";");
        bufferedWriter.write(book.getNumberOfPage() + ";");
        bufferedWriter.write(book.getPublishing() + ";");
        bufferedWriter.write(book.iseBook() + ";");
        bufferedWriter.close();
    }

    //перезаписать каталог
    public static void catalogInFile(Book book) throws IOException {
        catalogInFile(book, false);
    }

    public static void catalogInFile(Book book, boolean append) throws IOException {
        FileWriter fileWriter = new FileWriter(catalogPath, append);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(book.getNameBook() + ";");
        bufferedWriter.write(book.getAuthor() + ";");
        bufferedWriter.write(book.getIsbn() + ";");
        bufferedWriter.write(book.getDescription() + ";");
        bufferedWriter.write(book.getYearOfPublishing() + ";");
        bufferedWriter.write(book.getNumberOfPage() + ";");
        bufferedWriter.write(book.getPublishing() + ";");
        bufferedWriter.write(book.iseBook() + ";");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
