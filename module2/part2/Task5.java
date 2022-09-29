package module2.part2;

//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task5 {
    public static void main(String[] args) {

        int n = 8;                              //change matrix size here
        int[][] array2D = new int[n][n];
        int step = 0;
        int number = 1;

        if (n % 2 != 0) {
            System.out.println("Warning! n mast be even.");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {

                    if (i == step) {
                        array2D[i][j] = number;
                    } else {
                        array2D[i][j] = number++;
                        step++;
                        j--;                            //возвращение элемента j на один шаг назад,
                    }                                   //чтобы присвоить предыдущему array2D[i][j] значение number++.
                }                                       //Иначе оно будет number.
            }
            for (int i = 0; i < array2D.length; i++) {              //output matrix on screen
                System.out.println();                               //
                for (int j = 0; j < array2D[i].length; j++) {       //
                    System.out.print(array2D[i][j] + "  ");         //
                }
            }
        }
    }
}