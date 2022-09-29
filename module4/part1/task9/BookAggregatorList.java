package module4.part1.task9;

import java.util.List;

public class BookAggregatorList {

    private List<Book> bookList;

    public BookAggregatorList() {
    }

    public BookAggregatorList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {   // getter
        return bookList;
    }

    public void setBookList(List<Book> bookList) {      //setter
        this.bookList = bookList;
    }

    public void ShowThisAuthorsBooks(String nameAuthor) {
        for (Book author : bookList) {
            if (author.getAuthor().equalsIgnoreCase(nameAuthor))
                System.out.println(author);
        }
    }

    public void ShowThisPublisher(String namePublisher) {
        for (Book publisher : bookList) {
            if (publisher.getPublisher().equalsIgnoreCase(namePublisher))
                System.out.println(publisher);
        }
    }

    public void ShowBooksAfterThisYear(int year) {
        for (Book earOfPublish : bookList) {
            if (earOfPublish.getEarOfPublish() >= year)
                System.out.println(earOfPublish);
        }
    }
}
