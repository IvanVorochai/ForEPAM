package module2.part3;

import java.util.Arrays;

// 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <=...<= an. Требуется переставить элементы так,
// чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент и
// ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
// Написать алгоритм сортировки выбором.
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 50, 4, 7, 80, 99};

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minIndex] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}