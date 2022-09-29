package module3.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//2. В строке вставить после каждого символа 'a' символ 'b'.
public class Task2 {
    public static void main(String[] args) {
        String str = "I learn patterns, matches and regexes. aaaaa";
        System.out.println(str);

        //the first method
        String newStr1 = str.replace('a', 'b');
        System.out.println("I use replace: " + newStr1);

        //the second method
        str = "I learn patterns, matches and regexes. aaaaa";
        Pattern pattern = Pattern.compile("[a]");
        Matcher matcher = pattern.matcher(str);

        String newStr2 = matcher.replaceAll("b");
        System.out.println("I use RegEx: " + newStr2);
    }
}
