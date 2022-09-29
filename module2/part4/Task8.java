package module2.part4;

// Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.
public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        sumValuesInArray(array, 5, 10);
    }

    public static void sumValuesInArray(int[] numbers, int k, int m) {
        double sum;
        if (k > 0) {
            for (int i = k; i < m && i < numbers.length - 1; i++) {
                sum = numbers[i - 1] + numbers[i] + numbers[i + 1];
                System.out.println("Sum of the elements " + (i - 1) + "-" + (i + 1) + ":  " +
                        numbers[i - 1] + " + " + numbers[i] + " + " + numbers[i + 1] + " = " + sum);
            }
        } else {
            System.out.println("Warning! Going beyond the matrix. k > 0!!!");
        }
    }
}