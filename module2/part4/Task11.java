package module2.part4;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class Task11 {
    public static void main(String[] args) {
        doComparison(123, 4568);
        doComparison(-123, 456);
        doComparison(123, 1);

    }

    public static void doComparison(int number1, int number2) {
        int a = doComparisonHelper(Math.abs(number1));
        int b = doComparisonHelper(Math.abs(number2));
        if (a > b) {
            System.out.println("Digits in the value " + number1 + " more then in the value " + number2 + "\n" +
                    a + " > " + b);
        }
        if (a == b) {
            System.out.println("The number of digits are same in " + number1 + " and in " + number2 + "\n" +
                    a + " = " + b);
        }
        if (a < b) {
            System.out.println("Digits in the value " + number2 + " more then in the value " + number1 + "\n" +
                    a + " < " + b);
        }
    }

    public static int doComparisonHelper(int number) {
        int counter = 0;
        while (number > 0) {
            counter++;
            number = number / 10;
        }
        return counter;
    }
}
