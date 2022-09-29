package module4.part2.task3;

import java.util.ArrayList;
import java.util.List;

public class District {
    private List<City> city;
    private String name;

    public District() {
    }

    public District(List<City> city, String name) {
        this.city = city;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }

    public List<City> getCapitalsArea() {
        List<City> result = new ArrayList<>();
        for (City c : city) {
            if (c.isCapitalArea()) {
                result.add(c);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "District{" +
                "city=" + city +
                '}';
    }

    public double getSquare() {
        double result = 0;
        for (City d : city) {
            result = result + d.getSquare();
        }
        return result;
    }


}