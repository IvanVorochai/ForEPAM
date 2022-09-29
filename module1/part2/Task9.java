package module1.part2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        double x1, x2, x3, y1, y2, y3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую координату x1: ");
        x1 = scanner.nextDouble();
        System.out.print("Введите первую координату y1: ");
        y1 = scanner.nextDouble();

        System.out.print("Введите 2-ю координату x2: ");
        x2 = scanner.nextDouble();
        System.out.print("Введите 2-ю координату y2: ");
        y2 = scanner.nextDouble();

        System.out.print("Введите 3-ю координату x3: ");
        x3 = scanner.nextDouble();
        System.out.print("Введите 3-ю координату y3: ");
        y3 = scanner.nextDouble();

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.print("Точки лежат на одной прямой.");
        } else {
            System.out.print("Точки не лежат на одной прямой, а образуют треугольник.");
        }
    }
}
