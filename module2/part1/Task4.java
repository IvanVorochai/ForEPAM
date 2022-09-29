package module2.part1;

import java.util.Arrays;

//. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task4 {
    public static void main(String[] args) {

        double[] array1 = new double[10];
        int n = 25;     //input new value here
        double maxNumber = -n;
        double minNumber = n;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (Math.random() * 2 * n - n);
            System.out.printf("%.2f;  ", array1[i]);
            if (maxNumber < array1[i]) {
                maxNumber = array1[i];
                maxIndex = i;
            }
            if (minNumber > array1[i]) {
                minNumber = array1[i];
                minIndex = i;
            }
        }

        double temp = array1[minIndex];
        array1[minIndex] = array1[maxIndex];
        array1[maxIndex] = temp;

        System.out.println();
        System.out.printf("maxNumber %.2f ", maxNumber);
        System.out.println();
        System.out.println("maxIndex " + maxIndex);
        System.out.printf("minNumber %.2f ", minNumber);
        System.out.println();
        System.out.println("minIndex " + minIndex);
        System.out.println("Массив с переменой местами max и min значений: ");
        Arrays.stream(array1).forEach(e -> System.out.printf("%.2f;  ", e));
    }
}
