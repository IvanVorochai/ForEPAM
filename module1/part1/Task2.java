package module1.part1;

public class Task2 {
    //b+sqrt(b^2+4*a*c)/2/a-a^3*c+b^(-2)
    static double func(double a, double b, double c) {
        double z = (b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / 2 / a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(z);
        return z;
    }

    public static void main(String[] args) {
        func(1, 3, 3);
    }
}
