package module2.part2;


//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Task15 {
    public static void main(String[] args) {

        int[][] array2D = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {9, 8, 7, 4, 5, 6},
                {100, 5, 6, 7, 8, 2}};

        int max = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {                  //Max element
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                }
            }
        }
        System.out.println("Max number in maxtrix is " + max);

        for (int i = 0; i < array2D.length; i++) {                  //change odd elements
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] % 2 != 0) {
                    array2D[i][j] = max;
                }
            }
        }

        for (int i = 0; i < array2D.length; i++) {
            System.out.println();
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("%3d\t", array2D[i][j]);
            }
        }
    }
}
