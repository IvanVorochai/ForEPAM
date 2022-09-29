package module4.part2.task3;

////3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
////        столицу, количество областей, площадь, областные центры.
public class City {

    private String city;
    private boolean capitalState;
    private boolean capitalArea;
    private Double square;

    public City(String city, boolean capitalState, boolean capitalArea, double square) {
        this.city = city;
        this.capitalState = capitalState;
        this.capitalArea = capitalArea;
        this.square = square;
    }

    public City(boolean capitalState) {
        this.capitalState = capitalState;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isCapitalState() {
        return capitalState;
    }

    public void setCapitalState(boolean capitalState) {
        this.capitalState = capitalState;
    }

    public boolean isCapitalArea() {
        return capitalArea;
    }

    public void setCapitalArea(boolean capitalArea) {
        this.capitalArea = capitalArea;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return
                city;
    }

}
