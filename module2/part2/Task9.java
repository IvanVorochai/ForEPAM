package module2.part2;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму
public class Task9 {
    public static void main(String[] args) {

        int n = 5;
        int[][] array2D = new int[n][n];
        int column = 0;
        int maxColumn = 0;
        int orMaxColumn = -1;
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {                           //matrix creation
            for (int j = 0; j < n; j++) {
                array2D[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < n; i++) {                           //show the matrix on screen
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(array2D[i][j] + "   ");
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j == column) {
                    sum = sum + array2D[i][j];

                    if (i == n - 1) {
                        System.out.println("sum = " + sum + " in column " + column + ";");
                        if (maxSum < sum) {
                            maxSum = sum;
                            maxColumn = column;
                        }
                        if (maxSum == sum && column != maxColumn) {
                            orMaxColumn = column;                           //если больше 2-х повторений, то показывает
                        }                                                   //первую и последнюю из повторяющихся
                        j = ++column;
                        i = -1;
                        sum = 0;
                    }
                }
            }
        }
        System.out.print("Max sum = " + maxSum + " in column number " + maxColumn);
        if (orMaxColumn > -1) {
            System.out.print(" and " + orMaxColumn);
        }
    }
}
