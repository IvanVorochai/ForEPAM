package module2.part2;

import java.util.Scanner;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {
    public static void main(String[] args) {

        int[][] array2D = {                      //array [3][5]
                {1, 2, 3, 4, 5, 6},
                {6, 7, 8, 9, 0, 1},
                {-1, 2, -3, 5, -9, 1},
                {5, 4, 3, 0, 8, 9}
        };
        Scanner isScanner = new Scanner(System.in);
        System.out.print("Enter the line number, what you want to see on the screen: k = ");
        int k = isScanner.nextInt();
        System.out.print("Enter the column number, what you want to see on the screen: p = ");
        int p = isScanner.nextInt();

//        int p = 10;
//        int k = 5;

        System.out.println();
        System.out.println("For k = " + k + " the column will be:");

        if (k >= 4) {
            System.out.println("going beyond line number. Max k = 3.");
        }

        for (int i = 0; i < 4; i++) {                       //условие на вывод строки
            for (int j = 0; j < 6; j++) {
                if (i == k) {
                    System.out.print(array2D[i][j] + "  ");
                }
            }
        }

        System.out.println();
        System.out.println("For p = " + p + " the line will be:");

        if (p >= 6) {
            System.out.println("going beyond column number. Max p = 5.");
        }

        for (int i = 0; i < 4; i++) {                       //условие на вывод столбика
            for (int j = 0; j < 6; j++) {
                if (p == j) {
                    System.out.println(array2D[i][j]);
                }
            }
        }
    }
}