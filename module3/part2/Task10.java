package module3.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X
public class Task10 {
    public static void main(String[] args) {

        String text = "Down, down, down. Would the fall never" +
                "come to an end? “ I wonder how many miles" +
                "I’ve fallen by this time?” she said aloud... ";

        Pattern pattern = Pattern.compile("\\.+|\\?+!+|!+\\?+|!+|\\?+");
        Matcher matcher = pattern.matcher(text);
        int position = 0;
        int counter = 0;

        while (matcher.find(position)) {
            position = matcher.end();
            counter += 1;
        }
        System.out.println(counter);
    }
}
