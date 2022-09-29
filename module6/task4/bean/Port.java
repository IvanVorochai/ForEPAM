package module6.task4.bean;

public class Port {
    int max;
    int now;

    public Port(int max, int now) {
        this.max = max;
        this.now = now;
    }

    public int getMax() {
        return max;
    }

    public int getNow() {
        return now;
    }

    public synchronized void increment() {
        now++;
    }

    public synchronized void decrement() {
        now--;
    }

    public synchronized boolean testIncrement() {
        return now != max;
    }

    public synchronized boolean testDecrement() {
        return now != 0;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Порт: " + " вместимость " + max + " ,наличие контейнеров " + now);
        return string.toString();
    }
}