package module1.part2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner xRay = new Scanner(System.in);
        System.out.print("Введите угол а в градусах: ");
        a = xRay.nextDouble();
        System.out.print("Введите угол b в градусах: ");
        b = xRay.nextDouble();

        c = 180 - a - b;
        System.out.print("Угол с равен: " + c + "\n");

        if ((a + b < 180) && (a >= 0) && (b >= 0)) {
            if ((a == 90) || (b == 90) || (c == 90)) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не прямоугольный");
            }
            System.out.println("треугольник существует");
        } else {
            System.out.println("такого треугольника не существует");
        }
    }
}