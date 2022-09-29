package module2.part2;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.
public class Task11 {
    public static void main(String[] args) {

        int[][] array2D = new int[10][20];
        int step = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {                          //creation matrix
            for (int j = 0; j < 20; j++) {
                array2D[i][j] = (int) (Math.random() * 16);
            }
        }
        for (int i = 0; i < array2D.length; i++) {              //show matrix on the screen
            System.out.println();
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("%2d\t", array2D[i][j]);
            }
        }
        System.out.println();                                   //input on the screen column number what has 5
        for (int i = 0; i < array2D.length; i++) {              //more >=3 times is
            for (int j = 0; j < array2D[i].length; j++) {
                if (i == step && array2D[i][j] == 5) {
                    count++;

                    if (count >= 3) {
                        System.out.println("Column number what has 5 more >=3 times is: " + j);
                    }
                    if (j == 19) {
                        step++;
                    }
                }
            }
        }
        if (count < 3) {
            System.out.println("matrix hasn't columns what has 5 more >=3 times. Try again.");
        }
    }
}
