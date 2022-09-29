package module2.part2;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task6 {
    public static void main(String[] args) {

        int n = 10;
        int[][] array2D = new int[n][n];
        int[][] array2D1 = new int[n][n];
        int[][] array2D2 = new int[n][n];
        int step1 = 0;
        int step2 = n - 1;

        if (n % 2 != 0) {
            System.out.println("Warning! n mast be even.");
        } else {

            for (int i = 0; i < n; i++) {                       //создание двух матриц с пустыми областями
                for (int j = 0; j < i + 1; j++) {               //
                    array2D1[i][j] = 1;                         //array2D1 - пустота - верхний правый угол
                }                                               //array2D2 - пустота - нижний правый угол
            }                                                   //
            for (int i = 0; i < n; i++) {                       //
                for (int j = 0; j < n - i; j++) {               //
                    array2D2[i][j] = 1;                         //
                }
            }

            for (int i = 0; i < array2D.length; i++) {
                System.out.println();
                for (int j = 0; j < array2D[i].length; j++) {
                    array2D[i][j] = array2D1[i][j] + array2D2[i][j];    //суммирование матриц и получение области слева = 2 (в том числе и на диагоналях),
                    //области слева = 0, области сверху и снизу = 1.
                    if (i == j) {                                       // диагональ матрицы = 1
                        array2D[i][j] = 1;
                    }
                    if (i == step1 && j == step2) {                    // вторая диагональ матрицы = 1
                        array2D[i][j] = 1;
                        step1++; //0
                        step2--; //n-1
                    }
                    if (array2D[i][j] != 1) {                           //все значения 2 = 0
                        array2D[i][j] = 0;
                    }
                    System.out.print(array2D[i][j] + "  ");
                }
            }
        }
    }
}