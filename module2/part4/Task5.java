package module2.part4;

import java.util.Arrays;

//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).
public class Task5 {
    public static void main(String[] args) {
        double[] array = new double[]{-1, 1, -1, -1, 1};
        double[] array1 = new double[]{-1, -1, -1, -1, -1};
        double[] array2 = new double[]{10, 1, 5, 4, 3};
        System.out.println((findMaxMinusOneValue(array)));
        System.out.println((findMaxMinusOneValue(array1)));
        System.out.println((findMaxMinusOneValue(array2)));
    }

    public static Comparable<Double> findMaxMinusOneValue(double[] numbers) {
        Arrays.sort(numbers);
        double maxNumber = numbers[0];
        double maxNumberMinusOneValue = numbers[0];

        for (double number : numbers) {
            if (number > maxNumber) {
                maxNumberMinusOneValue = maxNumber;
                maxNumber = number;
            }
        }
        if (maxNumber == maxNumberMinusOneValue) {
            System.out.println("Warning! All values are same in array " + Arrays.toString(numbers) +
                    " so program cannot give you the right answer.");
            return null;
        }
        return maxNumberMinusOneValue;
    }
}