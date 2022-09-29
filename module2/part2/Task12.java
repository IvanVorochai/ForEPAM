package module2.part2;

import java.util.Arrays;
import java.util.Comparator;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {
    public static void main(String[] args) {

        int n = 3;
        int m = 5;
        Integer[][] array2D = new Integer[n][m];

        for (int i = 0; i < n; i++) {                           //создание рандомной матрицы
            for (int j = 0; j < m; j++) {                       //
                array2D[i][j] = (int) (Math.random() * 52 - 26);//
            }
        }
        System.out.println("the first random matrix:");         //вывод ее на экран
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("%3d\t", array2D[i][j]);
            }
            System.out.println();
        }

        for (Integer[] i : array2D) {                          //сортировка по возрастанию
            Arrays.sort(i);
        }

        System.out.println();
        System.out.println("sort matrix at min to max:");
        for (int i = 0; i < array2D.length; i++) {            //вывод на экран сортировки по возрастанию
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("%3d\t", array2D[i][j]);
            }
            System.out.println();
        }

        for (Integer[] j : array2D) {                         //сортировка по убыванию
            Arrays.sort(j, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1 < o2) return 1;
                    if (o1 > o2) return -1;
                    return 0;
                }
            });
        }

        System.out.println();
        System.out.println("sort matrix at max to min:");
        for (int i = 0; i < array2D.length; i++) {             //вывод на экран сортировки по убыванию
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("%3d\t", array2D[i][j]);
            }
            System.out.println();
        }
    }
}
