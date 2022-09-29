package module3.part2;

//6. Из заданной строки получить новую, повторив каждый символ дважды.
public class Task6 {
    public static void main(String[] args) {
        String str = "I like Java";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            result.append(letter).append(letter);
        }
        System.out.println(result);
    }
}