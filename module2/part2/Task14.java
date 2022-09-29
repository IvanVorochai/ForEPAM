package module2.part2;

import java.util.Arrays;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
public class Task14 {
    public static void main(String[] args) {

        int m = 5;
        int n = 5;
        int[][] array2D = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    array2D[i][j] = 1;
                } else {
                    array2D[i][j] = 0;
                }
            }
        }

        System.out.println();
        for (int[] each : array2D) {
            System.out.println(Arrays.toString(each));
        }
    }
}
