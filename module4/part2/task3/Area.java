package module4.part2.task3;

import java.util.ArrayList;
import java.util.List;

public class Area {

    private List<District> district;

    public Area() {
    }

    public Area(List<District> district) {
        this.district = district;
    }

    public List<District> getDistrict() {
        return district;
    }

    public void setDistrict(List<District> district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Area{" +
                "district=" + district +
                '}';
    }

    public List<City> getCapitalsArea() {
        List<City> result = new ArrayList<>();
        for (District d : district) {
            result.addAll(d.getCapitalsArea());
        }
        return result;
    }

    public double getSquare() {
        double result = 0;
        for (District d : district) {
            result = result + d.getSquare();
        }
        return result;
    }

    public int getNumberOfAreas() {
        int number = district.size();
        return number;
    }

}
