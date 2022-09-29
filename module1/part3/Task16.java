package module1.part3;

public class Task16 {
    public static void main(String[] args) {
        double e = 1.6;
        double a = -3;
        double b = 6.1;
        double h = 0.4;
        double sum = 0;

        for (double n = a; n <= b; n = n + h) {
            if (Math.abs(n) > e) {
                a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
                System.out.print("При n = " + n + " следует, что a(n)= " + a + ".\n");
                sum = sum + a;
            } else {
                System.out.print("/////При n = " + n + " значение |n|<=e = " + e + "\n");
            }
        }

        System.out.println("сумма членов ряда, модуль которых >= заданному e = " + e + " : " + sum);
    }
}
