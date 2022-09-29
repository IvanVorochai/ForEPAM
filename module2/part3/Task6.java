package module2.part3;

import java.util.Arrays;

//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются
// на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.
public class Task6 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 5, 11, 6, 99, 1, -5, 6, -88, 1, 0, 11};
        int temp;
        int j;
        for (int step = array.length / 2; step > 0; step /= 2)
            for (int i = step; i < array.length; i++) {
                temp = array[i];
                for (j = i; j >= step; j -= step) {
                    if (temp < array[j - step])
                        array[j] = array[j - step];
                    else
                        break;
                }
                array[j] = temp;
            }
        System.out.println(Arrays.toString(array));
    }
}
