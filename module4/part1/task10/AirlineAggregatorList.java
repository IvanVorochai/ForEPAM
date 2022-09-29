package module4.part1.task10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class AirlineAggregatorList {

    private List<Airline> airlineList;

    public AirlineAggregatorList() {
    }

    public AirlineAggregatorList(List<Airline> airlineList) {
        this.airlineList = airlineList;
    }

    public List<Airline> getAirlineList() {
        return airlineList;
    }

    public void setAirlineList(List<Airline> airlineList) {
        this.airlineList = airlineList;
    }

    public void showEndPlace(String place) {
        for (Airline airline : airlineList) {
            if (airline.getEndPlace().equalsIgnoreCase(place))
                System.out.println(airline);
        }
    }

    public void showADayOfWeek(LocalDate yearMonthDay) {
        for (Airline airline : airlineList) {
            if (airline.getTimeOfPlane().toLocalDate().isEqual(yearMonthDay))
                System.out.println(airline);
        }
    }

    public void showADayOfWeekAndTime(LocalDateTime yearMonthDayTime) {
        for (Airline airline : airlineList) {
            if (airline.getTimeOfPlane().toLocalDate().isEqual(yearMonthDayTime.toLocalDate())) {
                if (airline.getTimeOfPlane().isAfter(yearMonthDayTime))
                    System.out.println(airline);
            }
        }
    }
}
