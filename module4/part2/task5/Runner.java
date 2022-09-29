package module4.part2.task5;

import module4.part2.task5.forEnums.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<TouristHotel> tourist = new ArrayList<>();

        tourist.add(new TouristHotel(TourTo.ITALY, Days.DAYS_3, Transport.BUS, Eat.ALL_INCLUSIVE, Relax.SIGHTSEEING,
                Excursion.NO, Treatment.NO, Shoping.YES, Cruise.NO, StarsNumber.OTHER, Persons.TWO, 350));
        tourist.add(new TouristHotel(TourTo.ITALY, Days.DAYS_14, Transport.FLY, Eat.ALL_INCLUSIVE, Relax.SIGHTSEEING,
                Excursion.HISTORICAL, Treatment.NO, Shoping.YES, Cruise.NO, StarsNumber.OTHER, Persons.TWO, 1000));
        tourist.add(new TouristHotel(TourTo.ITALY, Days.DAYS_30, Transport.BOAT, Eat.ULTRA_ALL_INCLUSIVE, Relax.MOUNTAIN,
                Excursion.OTHER, Treatment.Mud_therapy, Shoping.YES, Cruise.YES, StarsNumber.FIVE, Persons.TWO, 5000));

        tourist.add(new TouristHotel(TourTo.CHINA, Days.DAYS_3, Transport.FLY, Eat.ROOM_ONLY, Relax.SIGHTSEEING,
                Excursion.NO, Treatment.NO, Shoping.YES, Cruise.NO, StarsNumber.THREE, Persons.ONE, 800));
        tourist.add(new TouristHotel(TourTo.CHINA, Days.DAYS_7, Transport.FLY, Eat.HALF_BOARD, Relax.SIGHTSEEING,
                Excursion.ARCHITECTURAL, Treatment.NO, Shoping.YES, Cruise.NO, StarsNumber.OTHER, Persons.TWO, 2000));
        tourist.add(new TouristHotel(TourTo.CHINA, Days.DAYS_12, Transport.FLY, Eat.ULTRA_ALL_INCLUSIVE, Relax.CHILDREN,
                Excursion.ART, Treatment.Complex_treatment, Shoping.YES, Cruise.NO, StarsNumber.FOUR, Persons.FOUR, 5000));

        tourist.add(new TouristHotel(TourTo.KAMCHATKA, Days.DAYS_3, Transport.BUS, Eat.ROOM_ONLY, Relax.MOUNTAIN,
                Excursion.OTHER, Treatment.NO, Shoping.NO, Cruise.NO, StarsNumber.OTHER, Persons.ONE, 350));
        tourist.add(new TouristHotel(TourTo.KAMCHATKA, Days.DAYS_10, Transport.BUS, Eat.ROOM_ONLY, Relax.MOUNTAIN,
                Excursion.OTHER, Treatment.NO, Shoping.NO, Cruise.NO, StarsNumber.OTHER, Persons.TWO, 700));
        tourist.add(new TouristHotel(TourTo.KAMCHATKA, Days.DAYS_7, Transport.BUS, Eat.FULL_BOARD, Relax.MOUNTAIN,
                Excursion.HISTORICAL, Treatment.Thermotherapy, Shoping.NO, Cruise.NO, StarsNumber.OTHER, Persons.TWO, 1200));

        TouristHotelAggregator aggregator = new TouristHotelAggregator(tourist);

        aggregator.printCountry(TourTo.ITALY);
        System.out.println();
        aggregator.printNumberOfDays(Days.DAYS_3);

        System.out.println();
        aggregator.printEat(Eat.ALL_INCLUSIVE);

        System.out.println();
        aggregator.printExcursion(Excursion.ART);

        System.out.println();
        aggregator.sortDays();


    }
}