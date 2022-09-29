package module3.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.
public class Task8 {
    public static void main(String[] args) {
        //2 method work always
        String str = "\"To be or not to be\"? This is a question.";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(str);
        int position = 0;
        String maxWord = "";

        while (matcher.find(position)) {
            position = matcher.end();
            String temp = matcher.group();
//            System.out.println(temp);
            if (temp.length() > maxWord.length()) {
                maxWord = temp;
            }
        }
        System.out.println(maxWord);
    }
}

//                //1 method. It does not work when we have got firs symbol like "
//        String str1 = "To be or not to be? This is a question!";
//
//        String[] words = str1.split("\\s+");
//        maxWord = "";
//        System.out.println(Arrays.toString(words));
//        for (String word : words) {
//            if (word.length() > maxWord.length()) {
//                maxWord = word;
//            }
//        }
//        System.out.println(maxWord);
//    }

