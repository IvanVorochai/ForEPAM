package module2.part1;

import java.util.Arrays;

//Дана последовательность целых чисел a1, a2, ... ,an. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min( a1, a2,..., an).
public class Task8 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[0];
        int j;
        int randomNumber = 50;
        int minNumber = randomNumber / 2 + 1;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * randomNumber + 1 - randomNumber / 2);
            if (minNumber > array1[i]) {
                minNumber = array1[i];
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("min munber is: " + minNumber);

        for (j = 0; j < array1.length; j++) {

            if (array1[j] != minNumber) {
                array2 = Arrays.copyOf(array2, array2.length + 1);
                array2[array2.length - 1] = array1[j];
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
