package module4.part1.task10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами иметодами.
// Задать критерии выбора данных и вывести эти данные на консоль. Airline: пункт назначения, номер рейса, тип самолета,
// время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
public class Runner {
    public static void main(String[] args) {

        List<Airline> airlineList = new ArrayList<>();

        airlineList.add(new Airline("Москва", 111, "AirbusA330neo", LocalDateTime.of(2022, Month.MARCH, 28, 19, 10)));
        airlineList.add(new Airline("Москва", 552, "Boeing 777X", LocalDateTime.of(2022, Month.MARCH, 29, 10, 10)));
        airlineList.add(new Airline("Тбилиси", 333, "AirbusA330neo", LocalDateTime.of(2022, Month.MARCH, 30, 15, 10)));
        airlineList.add(new Airline("Москва", 111, "AirbusA330neo", LocalDateTime.of(2022, Month.MARCH, 28, 10, 10)));
        airlineList.add(new Airline("Тбилиси", 222, "ABoeing 777X", LocalDateTime.of(2022, Month.MARCH, 29, 12, 10)));
        airlineList.add(new Airline("Ташкент", 778, "AirbusA330neo", LocalDateTime.of(2022, Month.MARCH, 29, 6, 10)));
        airlineList.add(new Airline("Тбилиси", 111, "AirbusA330neo", LocalDateTime.of(2022, Month.MARCH, 28, 10, 10)));
        airlineList.add(new Airline("Москва", 444, "AirbusA330neo", LocalDateTime.of(2022, Month.MARCH, 29, 15, 10)));
        airlineList.add(new Airline("Ташкент", 333, "Boeing 777X", LocalDateTime.of(2022, Month.MARCH, 30, 23, 10)));


        AirlineAggregatorList aggregator = new AirlineAggregatorList(airlineList);
        aggregator.showEndPlace("Ташкент");         //сортировка по задданному пункту назначения

        System.out.println();
        aggregator.showADayOfWeek(LocalDate.of(2022, Month.MARCH, 29));  //сортировка по дате

        System.out.println();
        aggregator.showADayOfWeekAndTime(LocalDateTime.of(2022, Month.MARCH, 29, 11, 0));//сортировка по дате и времени
    }
}
