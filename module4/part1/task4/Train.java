package module4.part1.task4;

public class Train {

    private final String startPlace;
    private final String endPlace;
    private final int numberOfTrain;
    private final String timeToMove;

    public Train(String startPlace, String endPlace, int numberOfTrain, String timeToMove) {

        this.startPlace = startPlace;
        this.endPlace = endPlace;
        this.numberOfTrain = numberOfTrain;
        this.timeToMove = timeToMove;
    }

    public void print() {
        System.out.println(numberOfTrain + " --> " + endPlace + " : " + timeToMove);
    }

    public String getEndPlace() {
        return endPlace;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public String getTimeToMove() {
        return timeToMove;
    }

    @Override
    public String toString() {
        return "Train " + startPlace + " --> " + endPlace + '\'' +
                ", number: " + numberOfTrain +
                ", time: " + timeToMove + '\'';
    }
}
