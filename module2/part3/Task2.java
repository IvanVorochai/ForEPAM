package module2.part3;

import java.util.ArrayList;
import java.util.Arrays;

//2. Даны две последовательности a1 <= a2 ... an и b1 <= b2 ... bm. Образовать из них новую последовательность чисел
// так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 7, 14, 21));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 5, 10, 15, 20));

        arrayList1.addAll(arrayList2);
        arrayList1.sort(Integer::compareTo);

        System.out.println(arrayList1);
    }
}
//        старый вариант
//        int[] array1 = new int[]{1, 30, 5, 7, 9};
//        int[] array2 = new int[]{1, 2, 2, 9, 5};
//        int[] array3 = new int[array1.length + array2.length];
//        int counter = 0;
//
//        for (int i = 0; i < array1.length; i++) {
//            array3[i] = array1[i];
//            counter++;
//        }
//
//        for (int i = 0; i < array2.length; i++) {
//            array3[counter] = array2[i];
//            counter++;
//        }
//
//        Arrays.sort(array3);
//        System.out.println(Arrays.toString(array3));