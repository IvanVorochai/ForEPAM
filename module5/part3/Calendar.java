package module5.part3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.
public class Calendar {
    private final Set<MonthDay> holidays = new HashSet<>();
    CustomHolidays customHolidays;

    public Calendar() {
        this.customHolidays = new CustomHolidays();
    }

    public void addHoliday(final MonthDay monthDay) {
        holidays.add(monthDay);
    }

    public void showWeekendAndHolidayBetween(final LocalDate start, final LocalDate end) {
        System.out.println("Total weekends and holidays: " +
                customHolidays.numberOfWeekendAndHolidayBetween(start, end));
        for (LocalDate i = start; !i.isAfter(end); i = i.plusDays(1)) {
            if (customHolidays.isHoliday(i)) {
                System.out.println(i + "  " + i.getDayOfWeek());
            }
        }
    }

    private class CustomHolidays {
        public int numberOfWeekendAndHolidayBetween(final LocalDate start, final LocalDate end) {
            int c = 0;
            for (LocalDate i = start; !i.isAfter(end); i = i.plusDays(1)) {
                if (isHoliday(i)) {
                    c++;
                }
            }
            return c;
        }

        private boolean isHoliday(final LocalDate localDate) {
            return isWeekend(localDate) || holidays.contains(toMonthDay(localDate));
        }

        private MonthDay toMonthDay(final LocalDate localDate) {
            return MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());
        }

        private boolean isWeekend(final LocalDate localDate) {
            final DayOfWeek dow = localDate.getDayOfWeek();
            return dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY;
        }
    }
}

