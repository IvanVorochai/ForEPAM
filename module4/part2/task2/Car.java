package module4.part2.task2;

import java.util.Scanner;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.
public class Car {

    private String car;
    private Wheel wheel;
    private Motor motor;
    private double fuelLevel;
    private double fuelСonsumption;
    private String carBrand;

    public Car() {
    }

    public Car(String car, Wheel wheel, Motor motor, double fuelLevel, double fuelСonsumption, String carBrand) {
        this.car = car;
        this.wheel = wheel;
        this.motor = motor;
        this.fuelLevel = fuelLevel;
        this.fuelСonsumption = fuelСonsumption;
        this.carBrand = carBrand;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getFuelСonsumption() {
        return fuelСonsumption;
    }

    public void setFuelСonsumption(double fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                ", wheel=" + wheel +
                ", motor=" + motor +
                ", fuelLevel=" + fuelLevel +
                ", fuelСonsumption=" + fuelСonsumption +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }

    void moveCar() {

        if (fuelLevel <= 0) {
            System.out.println("there is no fuel. If I want to move more, I must fill up the car with fuel");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hmm... How mach kilometers I want to move?");
        double s = scanner.nextDouble();
        if (s > fuelLevel / fuelСonsumption) {
            System.out.println("I don't have enough gas");
        } else {
            fuelLevel = fuelLevel - s * fuelСonsumption;
            System.out.println("fuel left: " + fuelLevel);
        }
    }

    void fillCar() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        fuelLevel = fuelLevel + i;
    }

    void changeAWheel() {

        System.out.println("change a type and quality of wheel on your car to... ");
        System.out.println("1. TIRES");
        System.out.println("2. TRACKS");
        System.out.println("3. SKIING");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Wheel wheel = null;

        switch (x) {
            case 1:
                wheel = new Wheel(TypeWheel.TIRES);
                break;
            case 2:
                wheel = new Wheel(TypeWheel.TRACKS);
                break;
            case 3:
                wheel = new Wheel(TypeWheel.SKIING);
                break;
            default:
                wheel = new Wheel(TypeWheel.TIRES);
        }
        changeQualityOfWheel(wheel);
        setWheel(wheel);
    }

    void changeQualityOfWheel(Wheel wheel) {
        System.out.println();
        System.out.println("1. BAD");
        System.out.println("2. NORMAL");
        System.out.println("3. GOOD");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        switch (y) {
            case 1:
                wheel.setType(QualityTypeWheel.BAD);
                break;
            case 2:
                wheel.setType(QualityTypeWheel.NORMAL);
                break;
            case 3:
                wheel.setType(QualityTypeWheel.GOOD);
                break;
            default:
                wheel.setType(QualityTypeWheel.GOOD);
        }
        setWheel(wheel);
    }
}
