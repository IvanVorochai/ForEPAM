package module4.part1.task8;

////8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
////и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
////и методами. Задать критерии выбора данных и вывести эти данные на консоль.

//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//        Найти и вывести:
//        a) список покупателей в алфавитном порядке;
//        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class Customer {

    private long id;
    private long creditCardNumber;
    private String bankAccountNumber;
    private String surname;
    private String firstName;
    private String middleName;
    private Address address;

    public Customer(long id, long creditCardNumber, String bankAccountNumber, String surname, String firstName,
                    String middleName, Address address) {
        this.id = id;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address=" + address +
                '}';
    }
}