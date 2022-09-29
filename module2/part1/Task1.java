package module2.part1;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Task1 {
    public static void main(String[] args) {
        int[] arrayA = {1, 5, 8, 9, 15, 8, 6, 11, 3};
        int k = 2;
        int sum = 0;

        for (int n : arrayA) {
            if (n % k != 0) {
                continue;
            }
            //System.out.println(n); // выдает на экран значения, которые кратны "k" и далее суммируются
            sum = sum + n;
        }
        System.out.println("Сумма значений кратных k=" + k + ": " + sum);

    }
}
