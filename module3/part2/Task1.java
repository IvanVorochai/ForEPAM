package module3.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Task1 {
    public static void main(String[] args) {
        String str = "   корабли     лавировали -   лавировали  да не    вылавировали";
        int counter;
        int maxCounter = 0;
        int position = 0;

        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find(position)) {
            position = matcher.end();
//           System.out.println(matcher.end() - matcher.start());
            counter = matcher.end() - matcher.start();
            if (counter > maxCounter) {
                maxCounter = counter;
            }
        }
        System.out.println("Max white spaces is " + maxCounter);
    }
}