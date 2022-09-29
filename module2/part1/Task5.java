package module2.part1;

import java.util.Arrays;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task5 {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[0];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 20 - 5);
            //System.out.println("значение " + array1[i] + " при индексе: " + i + "; ");  // to check index

            if (array1[i] > i) {
                array2 = Arrays.copyOf(array2, array2.length + 1);
                array2[array2.length - 1] = array1[i];
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}