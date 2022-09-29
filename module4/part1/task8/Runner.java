package module4.part1.task8;

//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.

//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//        Найти и вывести:
//        a) список покупателей в алфавитном порядке;
//        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer(1000L, 1111111122222222L, "BY11122233335551000333", "Nibler", "Lord", "",
                new Address("USA", "New York", "New New York", "Main street", "1", "")));
        customerList.add(new Customer(1001L, 1111111133333333L, "BY11122233335551000444", "Bender", "Bending",
                "Rodriguez", new Address("USA", "New York", "New New York", "Robots street", "10", "01010110")));
        customerList.add(new Customer(1002L, 1111111144444444L, "BY11122233335551000555", "Fry", "Pfilip",
                "Jay", new Address("USA", "New York", "New New York", "Main street", "1", "")));

        CustomerAggregatorList aggregator = new CustomerAggregatorList(customerList);
        System.out.println(aggregator);
        aggregator.showAlphabeticBySurname();
        System.out.println();
        aggregator.showCreditCardByRange(1111111100000000L, 1111111133333334L);

    }
}
