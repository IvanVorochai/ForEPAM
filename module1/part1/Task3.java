package module1.part1;

public class Task3 {
    //(sin x + cos y )(cos x - sin y ) * tg xy
    static double func(double x, double y) {
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(z);
        return z;
    }

    public static void main(String[] args) {
        func(0.5, 0.8);
    }
}
