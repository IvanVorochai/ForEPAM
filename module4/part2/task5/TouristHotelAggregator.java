package module4.part2.task5;

import module4.part2.task5.forEnums.Days;
import module4.part2.task5.forEnums.Eat;
import module4.part2.task5.forEnums.Excursion;
import module4.part2.task5.forEnums.TourTo;

import java.util.Comparator;
import java.util.List;

public class TouristHotelAggregator {
    private List<TouristHotel> touristHotelList;

    public TouristHotelAggregator(List<TouristHotel> touristHotelList) {
        this.touristHotelList = touristHotelList;
    }

    public List<TouristHotel> getTouristHotelList() {
        return touristHotelList;
    }

    public void setTouristHotelList(List<TouristHotel> touristHotelList) {
        this.touristHotelList = touristHotelList;
    }

    @Override
    public String toString() {
        return "TouristHotelAggregator{" +
                "touristHotelList=" + touristHotelList +
                '}';
    }

    public void printNumberOfDays(Days days) {       //выбор по количество дней
        for (TouristHotel daysNumber : touristHotelList) {
            if (daysNumber.getDays().equals(days)) {
                System.out.println(daysNumber);
            }
        }
    }

    public void printCountry(TourTo to) {             //выбор по стране
        for (TouristHotel whatCountry : touristHotelList) {
            if (whatCountry.getTourTo().equals(to)) {
                System.out.println(whatCountry);
            }
        }
    }

    public void printEat(Eat eat) {                 //выбор по еде
        for (TouristHotel whatEat : touristHotelList) {
            if (whatEat.getEat().equals(eat)) {
                System.out.println(whatEat);
            }
        }
    }

    public void printExcursion(Excursion excursion) {       //выбор по экскурсиям
        for (TouristHotel whatExcursion : touristHotelList) {
            if (whatExcursion.getExcursion().equals(excursion)) {
                System.out.println(whatExcursion);
            }
        }
    }

    public void sortDays() {           //сортировка по количеству дней
        touristHotelList.sort(new Comparator<TouristHotel>() {
            @Override
            public int compare(TouristHotel o1, TouristHotel o2) {
                return o1.getDays().compareTo(o2.getDays());
            }
        });
        for (TouristHotel x : touristHotelList) {
            System.out.println(x);
        }
    }
}

