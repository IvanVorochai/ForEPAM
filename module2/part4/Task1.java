package module2.part4;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:
public class Task1 {
    public static void main(String[] args) {
        System.out.println("gcd: " + gcdEuclidAlgorithm(60, -72));
        System.out.println("gcd: " + gcdEuclidAlgorithm(112, 100));
        System.out.println("gcd: " + gcdEuclidAlgorithm(5, 5));
        System.out.println("lcm: " + lcm(4, 9));
        System.out.println("lcm: " + lcm(55, 96));
        System.out.println("lcm: " + lcm(55, 55));
    }

    public static long gcdEuclidAlgorithm(long a, long b) { //НОД (Наибольший общий делитель)
        if (b == 0) {                                       // или gcd (Greatest Common Divisor)
            return Math.abs(a);
        }
        return gcdEuclidAlgorithm(b, a % b);
    }

    public static long lcm(long a, long b) {           //НОК (Наименьшее общее кратное)
        return a / gcdEuclidAlgorithm(a, b) * b;       //или lcm (Least Common Multiple)
    }
}
