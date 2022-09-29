package module2.part1;

import java.util.Arrays;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.
public class Task2 {
    public static void main(String[] args) {
        int[] arrayNameA = {10, 9, 11, 8, 12, 7, 13, -6};
        int limitZ = 9;
        int sumOverLimit = 0;
        System.out.println("Дан массив: " + Arrays.toString(arrayNameA));

        for (int i = 0; i < arrayNameA.length; i++) {
            if (arrayNameA[i] > limitZ) {
                arrayNameA[i] = limitZ;
                sumOverLimit = sumOverLimit + 1;
            }
        }
        System.out.println("Результат: " + Arrays.toString(arrayNameA));
//        for (int n : arrayNameA) {        // пример перевода из масива в строку
//            System.out.print(n + " ");    //
//        }                                 //
//        System.out.println();             //
        System.out.println("Количество значений при больших Z=" + limitZ + ": " + sumOverLimit);
    }
}
