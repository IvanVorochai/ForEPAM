package module3.part2;

//3. Проверить, является ли заданное слово палиндромом.
public class Task3 {
    public static void main(String[] args) {
        isPalindrom("qwewq");
        isPalindrom("NAvi");
        isPalindrom("111");
    }

    private static void isPalindrom(String str) {
        StringBuilder sb = new StringBuilder(str);
        String str2 = sb.reverse().toString();
        System.out.println("word " + str + " is palindrom = " + str.equalsIgnoreCase(str2));
    }
}
