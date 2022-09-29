package module1.part3;

import java.math.BigInteger;

public class Task15 {
    public static void main(String[] args) {

        BigInteger j = BigInteger.valueOf(1);
        for (int x = 1; x <= 200; x++) {
            j = j.multiply(BigInteger.valueOf((long) x * x));
            // System.out.print(j + "\n");
        }
        System.out.print(j);
    }
}
