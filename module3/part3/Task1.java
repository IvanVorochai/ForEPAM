package module3.part3;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
//операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
//отсортировать лексемы в предложении по убыванию количества вхо1ждений заданного символа, а в случае равенства – по
//алфавиту.
public class Task1 {
    public static void main(String[] args) throws IOException {

        String text = "С тех пор как. Незнайка совершил путешествие в.\n" +
                "Солнечный город, прошло два с половиной года.\n" +
                "Хотя для нас! С вами это не так. Много, но. для. маленьких. коротышек два.\n";

        runner(text);
    }

    public static void runner(String text) {
        while (true) {
            System.out.println("\nВыберите интересующий пункт: ");
            System.out.println("1. отсортировать абзацы по количеству предложений.");
            System.out.println("2. в каждом предложении отсортировать слова по длине.");
            System.out.println("3. отсортировать лексемы в предложении по убыванию количества вхождений" +
                    "заданного символа, а в случае равенства – по алфавиту.");
            System.out.println("4. выход.\n");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 3:
                    sortTokensInSentence(text);
                    break;
                case 2:
                    sortTheWordsInEachSentenceByLength(text);
                    break;
                case 1:
                    sortParagraphsByNumberOfSentence(text);
                    break;
            }
            if (choice == 4) {
                break;
            }
            if (choice > 4 || choice < 1) {
                System.out.println("введите номер от 1 до 4 для работы программы");
            }
        }
    }

    public static void sortParagraphsByNumberOfSentence(String text) {
        Pattern sentencePattern = Pattern.compile("[\\w, ]+[а-яА-Я, ]+[.!?]+");
        Pattern paragraphPattern = Pattern.compile(".+\n");
        Matcher paragraphMatcher = paragraphPattern.matcher(text);
        List<Long> sentenceNumberList = new ArrayList<>();
        List<String> paragraphList = new ArrayList<>();
        int paragraphPosition = 0;

        while (paragraphMatcher.find(paragraphPosition)) {
            paragraphPosition = paragraphMatcher.end();
            Matcher sentenceMatcher = sentencePattern.matcher(paragraphMatcher.group());
            sentenceNumberList.add(sentenceMatcher.results().count());//массив с количеством предложений в абзаце
            paragraphList.add(paragraphMatcher.group());    //группа, состоящая из предложений вошедших в абзац
        }

        long max = Collections.max(sentenceNumberList);     // максимальное количество предложений в абзаце

        for (int i = 0; i <= max; i++) {                    //распределение абзацев по количеству предложений
            for (int j = 0; j < sentenceNumberList.size(); j++) {
                if (i == sentenceNumberList.get(j)) {
                    System.out.print(paragraphList.get(j));
                }
            }
        }
    }

    public static void sortTheWordsInEachSentenceByLength(String text) {
        Pattern sentencePattern2 = Pattern.compile("[\\w, ]+[а-яА-Я, ]+[.!?]+");
//                Pattern sentencePattern2 = Pattern.compile("[а-яА-Я, ]+\\.+|[а-яА-Я, ]+!+|[а-яА-Я, ]+\\?+");
        Matcher sentenceMatcher2 = sentencePattern2.matcher(text);
        List<String> sentenceArray = new ArrayList<>();
        int sentencePosition = 0;


        while (sentenceMatcher2.find(sentencePosition)) {
            sentencePosition = sentenceMatcher2.end();
            sentenceArray.add(sentenceMatcher2.group());        //делаем массив по количеству предложений
        }

        for (String s : sentenceArray) {                        //сортировка массива по каждому предложению
            String str = s.trim().replaceAll("[.,?!\":;]+", "");
            String[] arrayStr = str.split("\\s+");              //разделяем по пробелу
            List<String> arrayListStr = Arrays.asList(arrayStr);
            arrayListStr.sort(Comparator.comparing(String::length));    //сортировка по длине слова
            System.out.println(arrayListStr);
        }
    }

    public static void sortTokensInSentence(String text) {
        String string1 = text.trim().replaceAll("[.,?!\":;]+", "");
        String[] wordsArray = string1.split("\\s+");
        List<String> wordList = Arrays.asList(wordsArray);
        wordList.sort(String::compareToIgnoreCase);             //сортировка по алфавиту

        char letter = 'а';
        int[] countArray = new int[wordsArray.length];

        for (int i = 0; i < wordsArray.length; i++) {           //создаем countArray, заполненый
            for (int j = 0; j < wordsArray[i].length(); j++) {  //цифрами равными количеству вхождений символа
                if (wordsArray[i].charAt(j) == letter) {
                    countArray[i] += 1;
                }
            }
        }
        for (int i = 0; i < countArray.length - 1; i++) {          //распределение слов по вхождению символа
            for (int j = 0; j < wordsArray.length; j++) {
                if (countArray[j] < countArray[i]) {
                    int temp = countArray[i];
                    String tempStr = wordsArray[i];
                    countArray[i] = countArray[j];
                    countArray[j] = temp;
                    wordsArray[i] = wordsArray[j];
                    wordsArray[j] = tempStr;
                }
            }
        }
        System.out.println(Arrays.toString(wordsArray));
    }
}