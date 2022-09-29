package module2.part2;

import java.util.Arrays;
import java.util.Comparator;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class Task13 {
    public static void main(String[] args) {

        int row = 5;
        int col = 5;
        int[][] array2D = new int[row][col];
        int[][] array2D1 = new int[row][col];
        int[][] array2D2 = new int[row][col];

        for (int i = 0; i < row; i++) {                         //creating random matrix
            for (int j = 0; j < col; j++) {
                array2D[i][j] = (int) (Math.random() * 52 - 26);
            }
        }
        System.out.println("the first random matrix:");         //show random matrix
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("%3d\t", array2D[i][j]);
            }
            System.out.println();
        }

        for (int columnCounter = 0; columnCounter < col; columnCounter++) {
            Integer[] array = new Integer[row];

            for (int i = 0; i < row; i++) {
                array[i] = array2D[i][columnCounter];
            }

            Arrays.sort(array);                                 //sort
            for (int i = 0; i < row; i++) {
                array2D1[i][columnCounter] = array[i];
            }

            Arrays.sort(array, new Comparator<Integer>() {      //revers sort
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1 < o2) return 1;
                    if (o1 > o2) return -1;
                    return 0;
                }
            });
            for (int i = 0; i < row; i++) {
                array2D2[i][columnCounter] = array[i];
            }
        }

        System.out.println("sort");
        for (int i = 0; i < array2D1.length; i++) {
            for (int j = 0; j < array2D1[i].length; j++) {
                System.out.printf("%3d\t", array2D1[i][j]);
            }
            System.out.println();
        }

        System.out.println("revers sort");
        for (int i = 0; i < array2D2.length; i++) {
            for (int j = 0; j < array2D2[i].length; j++) {
                System.out.printf("%3d\t", array2D2[i][j]);
            }
            System.out.println();
        }
    }
}
