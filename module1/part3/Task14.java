package module1.part3;

public class Task14 {
    public static void main(String[] args) {
        double sum = 0;
        for (int x = 1; x <= 100; x++) {
            sum = sum + Math.pow(x, 2);
        }
        System.out.print(sum);
    }
}
