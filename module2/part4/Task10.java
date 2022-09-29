package module2.part4;

import java.util.Arrays;

//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.
public class Task10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(doArray(5464)));
    }

    public static int[] doArray(int n) {
        int number = Math.abs(n);
        int temp = number;
        int count = 0;          //размер массива
        while (temp > 0) {      //подсчет значения кол-ва элементов в массиве
            count++;
            temp = temp / 10;
        }

        int[] array = new int[count];   //создание массива
        int j = count - 1;
        while (number > 0) {
            array[j--] = number % 10;
            number = number / 10;
        }
        return array;
    }
}