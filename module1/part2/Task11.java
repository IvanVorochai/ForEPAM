package module1.part2;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        double x;
        double f;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        x = scanner.nextDouble();

        if (x <= 3) {
            f = Math.pow(x, 2) - 3 * x + 9;
            System.out.println("Значение функции F(" + x + ") = " + f);
        } else {
            f = 1 / (Math.pow(x, 3) + 6);
            System.out.println("Значение функции F(" + x + ") = " + f);
        }
    }
}