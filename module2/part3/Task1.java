package module2.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.
public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1, "1", "2", "3", "4", "5");
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("111", "222", "333"));
        int k = 3;      //input new number here
        int j = 0;

        for (int i = 0; i < arrayList1.size() + arrayList2.size(); i++) {
            if (i >= k && i < k + arrayList2.size()) {
                arrayList1.add(i, arrayList2.get(j++));
            }
            if (k < 0 || k > arrayList1.size()) {
                System.out.println("the value of k goes beyond the size of the array");
                break;
            }
        }
        System.out.println(arrayList1);
    }
}
//        старый  вариант
//        int[] array1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
//        int[] array2 = new int[]{111, 222, 333, 444};
//        int[] array3 = new int[array1.length + array2.length];
//        int k = 4;
//        int j = 0;
//        for (int i = 0; i < array1.length + array2.length; i++) {
//            if (i < k) {
//                array3[i] = array1[i];
//            }
//            if (i >= k && i < k + array2.length) {
//                array3[i] = array2[j++];
//            }
//            if (i >= k + array2.length) {
//                array3[i] = array1[i - array2.length];
//            }
//        }
//        System.out.print(Arrays.toString(array3));