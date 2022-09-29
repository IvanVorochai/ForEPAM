package module3.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Task5 {
    public static void main(String[] args) {

        String str = "I like patterns, matchers and regexes.";
        int position = 0;
        int counter = 0;

        Pattern pattern = Pattern.compile("[a]");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find(position)) {
            position = matcher.end();
            counter++;
        }
        System.out.println("letter 'a' appears: " + counter + " times.");
    }
}
