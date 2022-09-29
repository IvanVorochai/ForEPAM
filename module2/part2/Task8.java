package module2.part2;

//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        int n = 5;
        int[][] array2D = new int[n][n];
        int step = 0;
        int temp;

        Scanner isScanner = new Scanner(System.in);             //the number of columns is entered from the keyboard
        System.out.print("Input the first column: ");
        int the1Column = isScanner.nextInt();
        System.out.print("Input the second column: ");
        int the2Column = isScanner.nextInt();

        if (the1Column > n || the2Column > n) {
            System.out.println("Warning! matrix [" + n + "][" + n + "]," +
                    "where the first or second column cannot be >= " + n);
            //System.exit(0);
        } else {
            for (int i = 0; i < n; i++) {                           //matrix creation

                for (int j = 0; j < n; j++) {                       //
                    array2D[i][j] = step++;                         //
                }
            }

            System.out.println("The first matrix: ");               //show the first matrix to screen
            for (int i = 0; i < array2D.length; i++) {              //
                System.out.println();                               //
                for (int j = 0; j < array2D[i].length; j++) {       //
                    System.out.print(array2D[i][j] + "  ");         //
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (j == the1Column) {                           //change columns
                        temp = array2D[i][j];                        //
                        array2D[i][j] = array2D[i][the2Column];      //
                        array2D[i][the2Column] = temp;               //
                    }
                }
            }
            System.out.println();
            System.out.println("the change column matrix: ");
            for (int i = 0; i < array2D.length; i++) {              //show the change column matrix to screen
                System.out.println();                               //
                for (int j = 0; j < array2D[i].length; j++) {       //
                    System.out.print(array2D[i][j] + "  ");         //
                }
            }
        }
    }
}
