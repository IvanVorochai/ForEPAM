package module3.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.
public class Task9 {
    public static void main(String[] args) {

        String text = "The rabbit-hole went straight on like a" +
                "tunnel for some way, and then dipped suddenly" +
                "down, so suddenly that Alice had not a moment" +
                "to think about stopping herself before she found" +
                "herself falling down what seemed to be a very" +
                "deep well.";

        Pattern pattern1 = Pattern.compile("[a-z]");
        Pattern pattern2 = Pattern.compile("[A-Z]");

        Matcher matcher1 = pattern1.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);

        int position1 = 0;
        int position2 = 0;
        int counterLittleLetters = 0;
        int counterBigLetters = 0;

        while (matcher1.find(position1)) {
            position1 = matcher1.end();
            counterLittleLetters += 1;
        }
        while (matcher2.find(position2)) {
            position2 = matcher2.end();
            counterBigLetters += 1;
        }
        System.out.println("Number of little letters: " + counterLittleLetters + "\n" +
                "Number of big letters: " + counterBigLetters);
    }
}
