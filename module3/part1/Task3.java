package module3.part1;

//3. В строке найти количество цифр.
public class Task3 {
    public static void main(String[] args) {
        String str = "кот съел 1 сосиску, 2 котлеты, 33 мухи";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("В строке " + count + " цифры(цифр)");
    }
}
