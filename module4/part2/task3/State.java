package module4.part2.task3;


import java.util.ArrayList;
import java.util.List;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//        столицу, количество областей, площадь, областные центры.
public class State {

    private String isState;
    private List<Area> area;

    public State() {
    }

    public State(String isState, List<Area> area) {
        this.isState = isState;
        this.area = area;
    }

    public String getIsState() {
        return isState;
    }

    public void setIsState(String isState) {
        this.isState = isState;
    }

    public List<Area> getArea() {
        return area;
    }

    public void setArea(List<Area> area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "State{" +
                "isState='" + isState + '\'' +
                ", area=" + area +
                '}';
    }

    public List<City> getCapitalsArea() {
        List<City> result = new ArrayList<>();
        for (Area a : area) {
            result.addAll(a.getCapitalsArea());
        }
        return result;
    }

    public City getCapital() {
        for (City c : getCapitalsArea()) {
            if (c.isCapitalState()) {
                return c;
            }
        }
        return null;
    }

    public double getSquare() {
        double result = 0;
        for (Area d : area) {
            result = result + d.getSquare();
        }
        return result;
    }


}
