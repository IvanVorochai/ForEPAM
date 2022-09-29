package module2.part4;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class Task2 {
    public static void main(String[] args) {
        System.out.println(mostCommonDivisor(10, 15, 20, 25));
        System.out.println(mostCommonDivisor(300, 400, 350, 50));
        System.out.println(mostCommonDivisor(-5, 5, -5, 5));
        System.out.println(mostCommonDivisor(3, 5, 7, 11));
        System.out.println(mostCommonDivisor(10, 10, 5, 10));
    }

    public static long helper(long a, long b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return helper(b, a % b);
    }

    public static long mostCommonDivisor(long a, long b, long c, long d) {
        long one = helper(a, b);
        long two = helper(c, d);
        return helper(one, two);
    }
}