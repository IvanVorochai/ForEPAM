package module3.part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//4. В строке найти количество чисел.
public class Task4 {
    public static void main(String[] args) {
        String str = "кот съел 1 сосиску, 2 котлеты, 33333 мухи";
//the first metod
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    continue;
                }
                count++;
            }
        }
        System.out.println("В строке " + count + " числа(чисел)");

//the second metod
        str = "кот съел 1 сосиску, 2 котлеты, 33333 мухи";
        Pattern standAloneNumber = Pattern.compile("\\d+");
        Matcher matcher = standAloneNumber.matcher(str);
        int pos = 0;
        count = 0;

        while (matcher.find(pos)) {
            pos = matcher.end();
            count++;
        }

        System.out.println("В строке " + count + " числа(чисел)");
    }
}

