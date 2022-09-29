package module2.part1;

import java.math.BigInteger;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
public class Task6 {
    public static void main(String[] args) {
        double[] arrayN = new double[26];
        double sumSimpleIndex = 0;
        int numberIndex = 0;

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = (Math.random() * 10);
            System.out.print(numberIndex++ + "..)  ");
            System.out.printf("%.1f;  ", arrayN[i]);

            if (i <= 1) {
                System.out.println();
            } else {
                BigInteger bigInteger = BigInteger.valueOf(i);
                boolean isProbablePrime = bigInteger.isProbablePrime(i);
                System.out.println(isProbablePrime);

                if (isProbablePrime == true) {
                    sumSimpleIndex = sumSimpleIndex + arrayN[i];
                }
            }
        }
        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами: ");
        System.out.printf("%.1f  ", sumSimpleIndex);
    }
}
