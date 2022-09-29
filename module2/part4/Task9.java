package module2.part4;
//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.l

public class Task9 {
    public static void main(String[] args) {
        System.out.println(areaOfSquare(15, 3, 9, 10));
    }

    public static double areaOfSquare(double x, double y, double z, double t) {
        double firstStep = x * y / 2;
        double PythagoreanTheorem = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double p = (z + t + PythagoreanTheorem) / 2;
        double secondStep = Math.sqrt(p * (p - z) * (p - t) * (p - PythagoreanTheorem));
        return firstStep + secondStep;
    }
}