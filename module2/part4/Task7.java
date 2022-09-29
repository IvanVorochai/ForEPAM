package module2.part4;

import java.math.BigInteger;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Task7 {
    public static void main(String[] args) {
        System.out.println("factorial just for negative 1 to 9 = " + getFactorialJustForNegative(1, 9));
    }

    public static BigInteger getFactorialJustForNegative(int factorialStart, int factorialFinish) {
        BigInteger result = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.ZERO;
        for (int i = factorialStart; i <= factorialFinish; i++) {
            result = result.multiply(BigInteger.valueOf(i));
            if (i % 2 != 0) {
                sum = sum.add(result);
            }
        }
        return sum;
    }

    public static BigInteger getFactorial(int fuctorial) {           //How to find a factorial
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= fuctorial; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
