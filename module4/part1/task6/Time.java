package module4.part1.task6;

public class Time {
    private int h;
    private int m;
    private int s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void AddHour(int h) {
        this.h += h;
        if (this.h < 0 || this.h > 23) {
            this.h = 0;
        } else {
            this.h = h;
        }
    }

    public void AddMinute(int m) {
        this.m += m;
        if (this.m < 0 || this.m > 59) {
            this.m = 0;
        } else {
            this.m = m;
        }
    }

    public void AddSecond(int s) {
        this.s += s;
        if (this.s < 0 || this.s > 59) {
            this.s = 0;
        } else {
            this.s = s;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "h=" + h +
                ", m=" + m +
                ", s=" + s +
                '}';
    }
}
