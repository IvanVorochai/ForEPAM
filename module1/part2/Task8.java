package module1.part2;

public class Task8 {
    public static void main(String[] args) {
        double a = -4.5;
        double b = -5;
        double c = -2;
        double d = 5;
        double z;
        z = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.print(z);
    }
}