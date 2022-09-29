package module2.part1;

import java.util.Arrays;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
public class Task9 {
    static public void main(String[] out) {

        int[] array = new int[]{2, 6, 1, 9, 6, 2, 7, 6, 5, 5};

        System.out.print(Arrays.toString(array));
        System.out.println();

        final int EXC = 0;                                  // Число которое будет заменять исключенные элементы
        int[] exceptionNumbers = new int[array.length];     // Массив исключений
        int counterOfSameNumbers = 0;                       // Счетчик одинаковых чисел
        int counter = 0;                                    // Счетчик массива исключений
        int minNumber = 10;

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j] && array[j] != EXC) { // Если числа одинаковы и число не исключено
                    counterOfSameNumbers++;                    // Прибавляем счетчик одинаковых чисел
                    exceptionNumbers[counter] = array[j];// Добавляем потенциально исключаемое число в массив исключений
                }
            }

            if (counterOfSameNumbers > 1) {         // Если найдено больше одного совпадения
                System.out.println("Число " + array[i] + " встречается " + counterOfSameNumbers +
                        " раз");                    //все встречающиеся максимальное количество раз цивры

                for (int j = 0; j < array.length; j++) {    // для чисел встречающихся более 2-х раз
                    if (array[j] == exceptionNumbers[counter]) {
                        array[j] = EXC;
                    }
                }
                if (minNumber > array[i]) {
                    minNumber = array[i];

                }
            }

            counterOfSameNumbers = 0;
            counter++;
        }
    }
}
