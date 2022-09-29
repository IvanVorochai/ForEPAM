package module4.part2.task3;

import java.util.List;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//        столицу, количество областей, площадь, областные центры.
public class Runner {
    public static void main(String[] args) {

        District district3 = new District(List.of(
                new City("Gomel", false, true, 50),
                new City("Mozyr", false, false, 60),
                new City("Rechitsa", false, false, 60.1),
                new City("Dobrush", false, false, 60.1),
                new City("Svetlogorsk", false, false, 60.1),
                new City("Zhlobin", false, false, 70.1)
        ), "Gomelskaya");
        District district5 = new District(List.of(
                new City("Minsk", true, true, 90),
                new City("Borisow", false, false, 50),
                new City("Soligorsk", false, false, 44.4),
                new City("Molodechno", false, false, 55.5),
                new City("Slutsk", false, false, 66.6),
                new City("Vileyka", false, false, 80)
        ), "Minskaya");
        District district6 = new District(List.of(
                new City("Mogilev", false, true, 55),
                new City("Osipovichi", false, false, 60),
                new City("Bobruisc", false, false, 50),
                new City("krichev", false, false, 44.4),
                new City("Gorki", false, false, 22.2)
        ), "Mogilevskaya");
        Area areaBelarus = new Area(List.of(
                district3,
                district5,
                district6
        ));
        State belarus = new State("Belarus", List.of(areaBelarus));

        System.out.println("Areas capitals are: " + belarus.getCapitalsArea());  //столицы областей
        System.out.println("Capital is: " + belarus.getCapital());       //столица страны
        System.out.println(belarus.getSquare());
        System.out.println(district3.getName() + " = " + district3.getSquare());
        System.out.println(district5.getName() + " = " + district5.getSquare());
        System.out.println(district6.getName() + " = " + district6.getSquare());
        System.out.println("Number of areas: " + areaBelarus.getNumberOfAreas());


    }

}
