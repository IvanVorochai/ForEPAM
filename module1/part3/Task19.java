package module1.part3;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {

        int number1 = 1228;
        int number2 = 861;
        int[] number1Array;
        int[] number2Array;
        int[] resultArray = new int[0];

        number1Array = getNumberArrayFromNumber(number1);
        number2Array = getNumberArrayFromNumber(number2);

        System.out.println(Arrays.toString(number1Array));
        System.out.println(Arrays.toString(number2Array));

        int counter = 0;
        for (int n1 : number1Array) {
            for (int n2 : number2Array) {
                if (n1 == n2) {
                    boolean contains = false;
                    for (int res : resultArray) {
                        if (res == n1) {
                            contains = true;
                            break;
                        }
                    }
                    if (!contains) {
                        resultArray = Arrays.copyOf(resultArray, counter + 1);
                        resultArray[counter] = n1;
                        counter++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] getNumberArrayFromNumber(int number) {
        int[] numberArray = new int[0];
        int n = number;
        int counter = 0;
        while (n > 0) {
            int mod = n % 10;
            n = n / 10;
            numberArray = Arrays.copyOf(numberArray, counter + 1);
            numberArray[counter] = mod;
            counter = counter + 1;
            //System.out.println(mod);
        }
        return numberArray;
    }
}
