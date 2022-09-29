package module2.part3;

import java.util.ArrayList;
import java.util.Arrays;

//7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <=...<= bm.
// Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <=...<= bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.
public class Task7 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 5, 10, 15, 20));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(-30, -20, -10, 1, 7, 9, 9, 9, 14, 21, 28));

        arrayList1.sort(Integer::compareTo);
        arrayList2.sort(Integer::compareTo);

        int lastNumbers = arrayList1.get(arrayList1.size() - 1);

        for (int i = 0; i < arrayList1.size(); i++) {
            for (int j = 0; j < arrayList2.size(); j++) {

                while (arrayList1.get(0) > arrayList2.get(j)) {     //for values that less than the first in arrayList1
                    if (i == 0 && arrayList2.get(j) < arrayList1.get(i + 1)) {
                        System.out.println("элемент " + j + "  второго массива " + arrayList2.get(j) +
                                " вставляется перед элементом первого массива " + arrayList1.get(i));
                    }
                    break;
                }

                while (arrayList1.get(i) <= arrayList2.get(j)) {      //for values that more or same

                    if (i != arrayList1.size() - 1 && arrayList2.get(j) < arrayList1.get(i + 1)) {

                        System.out.println("элемент " + j + " второго массива " + arrayList2.get(j) +
                                " вставляется после элемента первого массива " + arrayList1.get(i));
                    }
                    if (i == arrayList1.size() - 1) {
                        System.out.println("элемент " + j + "  второго массива " + arrayList2.get(j) +
                                " вставляется после элемента первого массива " + lastNumbers);
                    }
                    break;
                }
            }
        }
    }
}