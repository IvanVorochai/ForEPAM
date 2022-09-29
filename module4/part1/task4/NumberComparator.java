package module4.part1.task4;

import java.util.Comparator;

public class NumberComparator implements Comparator<Train> {

    @Override
    public int compare(Train o1, Train o2) {
//        return o1.getNumberOfTrain() - o2.getNumberOfTrain();
        return Integer.compare(o1.getNumberOfTrain(), o2.getNumberOfTrain());
    }

}

