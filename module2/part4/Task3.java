package module2.part4;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.
public class Task3 {
    public static void main(String[] args) {
        System.out.println("aria of 6-angle is: " + ariaOfTriangle(1) + " units");
        System.out.println("aria of 6-angle is: " + ariaOfTriangle(3) + " units");
        System.out.println("aria of 6-angle is: " + ariaOfTriangle(5) + " units");
    }

    public static double ariaOfTriangle(double a) {
        return Math.pow(a, 2) * Math.pow(3, 0.5) / 4 * 6;
    }
}
