package module2.part4;

//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.
public class Task13 {
    public static void main(String[] args) {
        getTwinSimple(1000);
    }

    public static void getTwinSimple(long number) {
        for (long i = number; i <= number * 2; i++) {
            if (checkSimple(i) && checkSimple(i + 2)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }

    public static boolean checkSimple(long n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
