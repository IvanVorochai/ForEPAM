package module2.part4;

//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.
public class Task14 {
    public static void main(String[] args) {
        ArmstrongNumber(10000);
    }

    public static void ArmstrongNumber(int finishNumber) {
        for (int i = 1; i < finishNumber; i++) {
            int tempNumber = i;
            int numberRisedSum = 0;
            while (tempNumber != 0) {
                int digit = tempNumber % 10;
                numberRisedSum = (int) (numberRisedSum + Math.pow(digit, helper(i)));
                tempNumber /= 10;
            }
            if (numberRisedSum == i) {
                System.out.println(i + " Armstrong number");
            }
        }
    }

    public static double helper(int number) {
        int counter = 0;
        while (number > 0) {
            counter++;
            number /= 10;
        }
        return counter;
    }
}