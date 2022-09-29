package module2.part2;

//7. Сформировать квадратную матрицу порядка n по правилу a[i,j]=sin((i^2-j^2)/n)
// и подсчитать количество положительных элементов в ней.
public class Task7 {
    public static void main(String[] args) {

        int n = 6;
        double[][] a = new double[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (a[i][j] > 0) {
                    count++;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {                    //view the matrix
            System.out.println();                               //
            for (int j = 0; j < a[i].length; j++) {             //
                if (a[i][j] == 0) {                             //
                    System.out.print(0 + "  ");                 //simplification of the matrix view
                } else {                                        //
                    System.out.printf("%.3f \t", a[i][j]);       //simplification of the matrix view

                }
            }
        }
        System.out.println("\nPositive elements is: " + count);
    }
}
