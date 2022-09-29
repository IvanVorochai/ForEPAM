package module3.part2;

//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”
public class Task4 {
    public static void main(String[] args) {
        String str = "Информатика";
        char ch1 = str.charAt(7);
        char ch2 = str.charAt(3);
        char ch3 = str.charAt(4);
        System.out.print("" + ch1 + ch2 + ch3 + ch1);
    }
}