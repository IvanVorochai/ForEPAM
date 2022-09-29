package module2.part4;

import java.util.Arrays;
import java.util.Scanner;

//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
public class Task4 {
    public static void main(String[] args) {
        //if you have only 3 points
        System.out.println(forThreePoints(new double[]{1, 4}, new double[]{1, 3}, new double[]{1, 2}));
        System.out.println(forThreePoints(new double[]{1, 50}, new double[]{-40, 10}, new double[]{30, -5}));

        //for 2 random points and more
        findMaxLength(randomPoints(2));         //input new number for change matrix length

        //for 2 points and more which the user has selected
        findMaxLength(selectedPoints(5));
    }


    public static double forThreePoints(double[] a, double[] b, double[] c) {
        double ab = Math.pow(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2), 0.5);
        double bc = Math.pow(Math.pow(b[0] - c[0], 2) + Math.pow(b[1] - c[1], 2), 0.5);
        double ac = Math.pow(Math.pow(a[0] - c[0], 2) + Math.pow(a[1] - c[1], 2), 0.5);
        if (ab > bc && ab > ac) {
            System.out.println("\nthe longest distance between (.)A and (.)B");
        } else if (bc > ac) {
            System.out.println("\nthe longest distance between (.)B and (.)C");
        } else if (ac > ab) {
            System.out.println("\nthe longest distance between (.)A and (.)C");
        }
        return Math.max(Math.max(ab, bc), ac);
    }

    public static int[][] selectedPoints(int points) {              //create a matrix with certain points
        Scanner scanner = new Scanner(System.in);                   //that the user has selected

        int[][] array = new int[points][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 == 0) {
                    System.out.print("input new x" + (i + 1) + "\n");
                    array[i][j] = scanner.nextInt();
                } else {
                    System.out.print("input new y" + (i + 1) + "\n");
                    array[i][j] = scanner.nextInt();
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        return array;
    }

    public static int[][] randomPoints(int points) {                  //create matrix with random points
        int[][] array = new int[points][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
            }
        }
        System.out.println(Arrays.deepToString(array));             //show which matrix was created
        return array;
    }

    public static void findMaxLength(int[][] arrayPoints) {
        double length;
        double maxLength = 0;
        int[] betweenPoints = new int[2];

        for (int i = 0; i < arrayPoints.length; i++) {
            for (int j = 1; j < arrayPoints.length; j++) {
                length = getDistance(arrayPoints[i][0], arrayPoints[i][1], arrayPoints[j][0], arrayPoints[j][1]);
                if (length > maxLength) {
                    maxLength = length;
                    betweenPoints[0] = i + 1;
                    betweenPoints[1] = j + 1;
                }
            }
        }
        System.out.println("the longest distance between " + betweenPoints[0] + " and " +
                betweenPoints[1] + " points. The length = " + maxLength + "\n");
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}