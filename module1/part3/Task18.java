package module1.part3;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нижний предел значений m: ");
        int m = sc.nextInt();
        System.out.println("Введите верхний предел значений n: ");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Значения m и n должны быть положительными.");
        } else if (m > n) {
            System.out.println("Значение m  должно быть меньше n.");
        } else {
            for (int x = m; x <= n; x++) {
                System.out.print("\nЧисло " + x + " имеет следующие делители: ");
                for (int j = 2; j < x; j++) {
                    if (x % j == 0) {
                        System.out.print(j + ", ");
                    }
                }
            }
        }
    }
}
