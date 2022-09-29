package module1.part1;

public class Task1 {
    // z=((a-3)*b/2)+c
    public static double func(double a, double b, double c) {
        double z = ((a - 3) * b) / 2 + c;
        return z;
    }

    public static void main(String[] args) {
        double res = func(6, 1, 5);
        System.out.println(res);
    }
}
