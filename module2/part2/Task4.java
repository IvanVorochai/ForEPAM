package module2.part2;

//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task4 {
    public static void main(String[] args) {

        int n = 6;                               //change matrix size here
        int[][] array2D = new int[n][n];
        int step1 = 1;
        int step2 = n;

        if (n % 2 != 0) {
            System.out.println("Warning! n must be even ");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (i % 2 == 0) {
                        array2D[i][j] = step1;
                        step1++;
                        if (step1 == n + 1) {
                            step1 = 1;
                        }
                    }
                    if (i % 2 != 0) {
                        array2D[i][j] = step2;
                        step2--;
                        if (step2 == 0) {
                            step2 = n;
                        }
                    }
                }
            }
            for (int i = 0; i < array2D.length; i++) {          //output matrix on the screen
                System.out.println();
                for (int j = 0; j < array2D[i].length; j++) {
                    System.out.print(array2D[i][j] + "  ");
                }
            }
        }
    }
}