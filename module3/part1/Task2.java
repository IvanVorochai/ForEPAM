package module3.part1;

//2. Замените в строке все вхождения 'word' на 'letter'.
public class Task2 {
    public static void main(String[] args) {
        String str = "Hello word world. words ";
        String newStr = str.replace("word", "letter");

        System.out.println(newStr);
    }
}
