package module2.part1;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int n = 5;                             //колличество элементов в матрице *2
        int randomNumber = 20;                 //(предел max и min значения в матрице)/2
        int[] array1 = new int[2 * n];
        int[] array2 = new int[n];
        int maxSumma = -randomNumber / 2 - 1;  //переменная для нахождения max значения

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * randomNumber + 1 - randomNumber / 2);
        }
        System.out.print(Arrays.toString(array1));

        for (int j = 0; j < array2.length; j++) {
            array2[j] = array1[j] + array1[array1.length - 1 - j];

            if (maxSumma <= array2[j]) {
                maxSumma = array2[j];
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.println("Max(A1 + A2n, A2 + A2n-1, ..., An + An+1) = " + maxSumma);
    }
}
