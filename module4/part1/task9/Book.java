package module4.part1.task9;
//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.

//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class Book {
    private String id;
    private String nameOfTheBook;
    private String author;
    private String publisher;
    private int earOfPublish;
    private int numberOfPages;
    private double cost;
    private String typeOfBinding;

    public Book() {
    }

    public Book(String id, String nameOfTheBook, String author, String publisher, int earOfPublish,
                int numberOfPages, double cost, String typeOfBinding) {
        this.id = id;
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.publisher = publisher;
        this.earOfPublish = earOfPublish;
        this.numberOfPages = numberOfPages;
        this.cost = cost;
        this.typeOfBinding = typeOfBinding;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getEarOfPublish() {
        return earOfPublish;
    }

    public void setEarOfPublish(int earOfPublish) {
        this.earOfPublish = earOfPublish;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", nameOfTheBook='" + nameOfTheBook + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", earOfPublish=" + earOfPublish +
                ", numberOfPages=" + numberOfPages +
                ", cost=" + cost +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                '}';
    }
}
