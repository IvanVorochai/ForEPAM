package module5.part3;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Runner {
    public static void main(String[] args) {

        Calendar calendar = new Calendar();
        calendar.addHoliday(MonthDay.of(Month.MAY, 1));
        calendar.addHoliday(MonthDay.of(Month.MAY, 9));
        calendar.addHoliday(MonthDay.of(Month.MARCH, 8));
        calendar.addHoliday(MonthDay.of(Month.DECEMBER, 31));

        calendar.showWeekendAndHolidayBetween(LocalDate.of(2022, 4, 15), LocalDate.of(2022, 6, 15));
    }
}
