package module4.part1.task9;

import java.util.ArrayList;
import java.util.List;

////9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
////метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
//// Задать критерии выбора данных и вывести эти данные на консоль.
////Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
////Найти и вывести:
////a) список книг заданного автора;
////b) список книг, выпущенных заданным издательством;
////c) список книг, выпущенных после заданного года.
public class Runner {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("ISBN 978-5-8459-1759-1", "Java. Полное руководство", "Шилдт",
                "Вильямс", 2013, 1104, 149.99, "твердый"));
        bookList.add(new Book("ISBN 978-5-17-075250-8", "Игра престолов", "Мартин",
                "АСТ", 2011, 766, 54.99, "твердый"));
        bookList.add(new Book("ISBN 5-09-003876-7", "Геометрия. Учебник для 7-9 классов", "Атанасян",
                "Просвещение", 1990, 335, 20.50, "твердый"));
        bookList.add(new Book("ISBN 5-7684-0655-7", "Кого за смертью посылать", "Успенский",
                "АСТ", 1998, 384, 30.15, "твердый"));

        BookAggregatorList aggregator = new BookAggregatorList(bookList);
        aggregator.ShowThisAuthorsBooks("Мартин");          //агрегация по автору

        System.out.println();
        aggregator.ShowThisPublisher("аст");                //агрегация по издательству

        System.out.println();
        aggregator.ShowBooksAfterThisYear(2000);            //агрегация выпуску книг после данного года
    }
}
