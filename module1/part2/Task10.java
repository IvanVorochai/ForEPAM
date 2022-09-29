package module1.part2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int a, b;
        int x, y, z;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину a отверстия: ");
        a = scanner.nextInt();
        System.out.print("Введите высоту b отверстия: ");
        b = scanner.nextInt();

        System.out.print("Введите ширину кирпича: ");
        x = scanner.nextInt();
        System.out.print("Введите длину кирпича: ");
        y = scanner.nextInt();
        System.out.print("Введите высоту кирпича: ");
        z = scanner.nextInt();

        int minSizeBrick = Math.min(Math.min(x, y), z);
        int averageSizeBrick = Math.max(Math.min(x, y), Math.min(Math.max(x, y), z));
        int minHole = Math.min(a, b);
        int maxHole = Math.max(a, b);

        if (minHole > minSizeBrick && maxHole > averageSizeBrick) {
            System.out.print("Кирпичь пройдет через отверстие.");
        } else {
            System.out.print("Кирпичь не пролезет через отверстие.");
        }
    }
}