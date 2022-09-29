package module2.part3;

import java.util.Arrays;

//4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
public class Task4 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 5, 11, 6, 99, 1, -5, 6, -88, 1, 0, 11};
        boolean sorted = false;
        int temp;
        int counter = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                    counter++;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество перестоновок: " + counter);
    }
}
