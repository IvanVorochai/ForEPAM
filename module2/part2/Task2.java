package module2.part2;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {
    public static void main(String[] args) {

        int[][] array2D = {
                {1, 2, 3, 4, 5},
                {5, 6, 7, 8, 9},
                {9, 7, 4, 2, -1},
                {4, 4, 4, -4, 1},
                {0, 1, 7, -5, 0}
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print(array2D[i][j] + ", ");
                }
            }
        }
    }
}