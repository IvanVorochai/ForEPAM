package module2.part4;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
public class Task6 {
    public static void main(String[] args) {
        System.out.println(relativelyPrimeNumbers(111, 5, 11));
        System.out.println(relativelyPrimeNumbers(-3, 14, 7));
        System.out.println(relativelyPrimeNumbers(-7, -1, 11));
        System.out.println(relativelyPrimeNumbers(1, 1, 1));
        System.out.println(relativelyPrimeNumbers(1, 50, 10));
    }

    public static boolean relativelyPrimeNumbers(long a, long b, long c) {      //relatively prime Number
        long[] array1 = new long[]{a, b};                                       //взаимно простые числа
        long[] array2 = new long[]{b, c};
        long[] array3 = new long[]{a, c};
        return gcdEuclidAlgorithm(array1) == gcdEuclidAlgorithm(array2) &&
                gcdEuclidAlgorithm(array1) == gcdEuclidAlgorithm(array3);
    }

    public static long gcdEuclidAlgorithm(long[] a) {       //gcd (Greatest Common Divisor)
        if (a[1] == 0) {
            return Math.abs(a[0]);
        }
        return gcdEuclidAlgorithm(new long[]{a[1], a[0] % a[1]});
    }
}