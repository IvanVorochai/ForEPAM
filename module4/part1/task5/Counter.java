package module4.part1.task5;

public class Counter {

    private int max;
    private int min;
    private int variable;
    private int presentValue;

    public Counter() {
        this.max = 0;
        this.min = 5;
        this.variable = 1;
        this.presentValue = 1;
    }

    public Counter(int min, int max, int variable, int presentValue) {
        this.max = max;
        this.min = min;
        this.variable = variable;
        this.presentValue = presentValue;
    }

    @Override
    public String toString() {
        return "at " + min + " from " + max + ". Counter = " + presentValue;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }

    public void setPresentValue(int presentValue) {
        this.presentValue = presentValue;
    }

    public void plus() {
        presentValue = presentValue + variable;
        if (presentValue > max) {
            presentValue = min + (-max + presentValue) - 1;
        }
        if (presentValue < min) {
            presentValue = max - min + presentValue + 1;
        }
    }

    public void minus() {
        presentValue = presentValue - variable;
        if (presentValue > max) {
            presentValue = min + max - presentValue - 1;
        }
        if (presentValue < min) {
            presentValue = max - min + presentValue + 1;
        }
    }


}
