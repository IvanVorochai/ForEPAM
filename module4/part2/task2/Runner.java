package module4.part2.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

////2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
////менять колесо, вывести на консоль марку автомобиля.
public class Runner {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("taxi", new Wheel(TypeWheel.TIRES, QualityTypeWheel.BAD),
                new Motor("motor"), 20, 0.1, "London cab"));
        carList.add(new Car("taxi", new Wheel(TypeWheel.TIRES, QualityTypeWheel.NORMAL),
                new Motor("motor"), 20, 0.12, "American taxi"));
        carList.add(new Car("tank", new Wheel(TypeWheel.TRACKS, QualityTypeWheel.BAD),
                new Motor("motor"), 400, 1.2, "Tank1"));
        carList.add(new Car("tank", new Wheel(TypeWheel.TRACKS, QualityTypeWheel.NORMAL),
                new Motor("motor"), 20, 1.5, "Tank2"));

        System.out.println("Change the car\n 0 = London cab, 1 = American taxi, 2 = Tank1, 3 = Tank2");
        Scanner scanner = new Scanner(System.in);
        int carNumber = scanner.nextInt();
        Car car = carList.get(carNumber); // выбор машины

        while (true) {
            System.out.println("1. move");
            System.out.println("2. fill fuel");
            System.out.println("3. change a wheel");
            System.out.println("4. show a car brand");
            System.out.println("5. break");


            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    car.moveCar();
                    System.out.println(car);
                    break;
                case 2:
                    car.fillCar();
                    System.out.println(car);
                    break;
                case 3:
                    car.changeAWheel();
                    System.out.println(car);
                    break;
                case 4:
                    System.out.println(car.getCarBrand());

            }
            if (i == 5) {
                break;
            }
        }
    }
}
