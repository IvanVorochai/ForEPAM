package module2.part2;

//10. Найти положительные элементы главной диагонали квадратной матрицы
public class Task10 {
    public static void main(String[] args) {

        int n = 5;
        int[][] array2D = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = (int) (Math.random() * 51 - 10);
            }
        }
        for (int i = 0; i < array2D.length; i++) {
            System.out.println();
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("%2d\t", array2D[i][j]);
            }
        }
        System.out.println();
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (i == j && array2D[i][j] > 0) {
                    System.out.println("positive elements on main diagonal " + array2D[i][j] + ".");
                }
            }
        }
    }
}
