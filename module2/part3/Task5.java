package module2.part3;
//5. Сортировка вставками. Дана последовательность чисел a1 ,a2 ,... ,an. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть a1 , a2 , ... , ai - упорядоченная последовательность, т. е.
//a1 <= a2 <=...<= an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью
// двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] array = new int[]{3, 1, 3, 55, 2, 9, -2, 8, 14};

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        int index = binarySearch(array, 3);
        System.out.println(Arrays.toString(array));
        System.out.println((array[index]));
    }

    public static int binarySearch(int[] arr, int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }
            if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
            if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
}

