package module4.part1.task4;

import java.util.Comparator;

public class EndPlaceAndTimeComparator implements Comparator<Train> {

    @Override
    public int compare(Train o1, Train o2) {
        //       o1.getEndPlace().compareTo(o2.getEndPlace());
        int result = o1.getEndPlace().compareTo(o2.getEndPlace());
        if (result == 0) {
            return o1.getEndPlace().compareTo(o2.getEndPlace());
        }
        return result;
    }
}


