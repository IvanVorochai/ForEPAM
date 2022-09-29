package module2.part2;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task1 {
    public static void main(String[] args) {

        int[][] array2D = {
                {1, 4, 2, 5, 4, 4, 5, 8, 1, 9},
                {2, 3, 2, 4, 3, 4, 1, 5, 2, 3},
                {3, 2, 2, 1, 2, 4, 1, 5, 4, 5},
                {4, 2, 1, 5, 1, 3, 5, 8, 6, 7}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (j % 2 != 0 && array2D[0][j] > array2D[3][j]) {
                    System.out.print(array2D[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}