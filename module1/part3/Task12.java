package module1.part3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное целое число, до которого будут просуммированны числа: ");
        int y = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= y; i++) {
            //sum += i;
            sum = sum + i;
        }
        System.out.println("Сумма всех значений от 1 до " + y + " = " + sum);
    }
}