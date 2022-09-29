package module6.task1.bean;

public class Book {
    String nameBook;
    String author;
    String isbn;
    String description;
    int yearOfPublishing;
    int numberOfPage;
    String publishing;
    boolean eBook;

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public boolean iseBook() {
        return eBook;
    }

    public void seteBook(boolean eBook) {
        this.eBook = eBook;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Наименование книги: " + nameBook + "\n");
        stringBuilder.append("Автор: " + author + "\n");
        stringBuilder.append("ISBN: " + isbn + "\n");
        stringBuilder.append("Аннотация: " + description + "\n");
        stringBuilder.append("Год издания: " + yearOfPublishing + "\n");
        stringBuilder.append("Количество страниц: " + numberOfPage + "\n");
        stringBuilder.append("Издательство: " + publishing + "\n");
        stringBuilder.append("Электронная книга: " + eBook + "\n");
        return stringBuilder.toString();
    }
}
