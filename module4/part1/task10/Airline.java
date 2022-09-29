package module4.part1.task10;

import java.time.LocalDateTime;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами иметодами.
// Задать критерии выбора данных и вывести эти данные на консоль. Airline: пункт назначения, номер рейса, тип самолета,
// время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
public class Airline {

    private String endPlace;
    private int NumberOfRace;
    private String typeOfAirplane;
    //    private SimpleDateFormat timeOfPlane = new SimpleDateFormat("HH:mm");
//    private SimpleDateFormat daysOfTheWeek = new SimpleDateFormat("dd.MMMM.y");
    private LocalDateTime timeOfPlane;

    public Airline() {
    }

    public Airline(String endPlace, int numberOfRace, String typeOfAirplane, LocalDateTime timeOfPlane) {
        this.endPlace = endPlace;
        NumberOfRace = numberOfRace;
        this.typeOfAirplane = typeOfAirplane;
        this.timeOfPlane = timeOfPlane;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public int getNumberOfRace() {
        return NumberOfRace;
    }

    public void setNumberOfRace(int numberOfRace) {
        NumberOfRace = numberOfRace;
    }

    public String getTypeOfAirplane() {
        return typeOfAirplane;
    }

    public void setTypeOfAirplane(String typeOfAirplane) {
        this.typeOfAirplane = typeOfAirplane;
    }

    public LocalDateTime getTimeOfPlane() {
        return timeOfPlane;
    }

    public void setTimeOfPlane(LocalDateTime timeOfPlane) {
        this.timeOfPlane = timeOfPlane;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "endPlace='" + endPlace + '\'' +
                ", NumberOfRace=" + NumberOfRace +
                ", typeOfAirplane='" + typeOfAirplane + '\'' +
                ", timeOfPlane=" + timeOfPlane +
                '}';
    }
}
