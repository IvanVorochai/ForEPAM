package module1.part3;

public class Task13 {
    public static void main(String[] args) {
        double a = -1;
        double b = 5.4;
        double h = 0.5;
        double y;

        for (double x = a; x <= b; x = x + h) {
            if (x <= 2) {
                y = -x;
                System.out.println(y);
            } else {
                y = x;
                System.out.println((y));
            }
        }
    }
}
