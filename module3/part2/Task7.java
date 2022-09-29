package module3.part2;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было
// введено "abc cde def", то должно быть выведено "abcdef".
public class Task7 {
    public static void main(String[] args) {
        String str = "abc cde def";
        System.out.println(str.replaceAll("(.)(?=.*\\1)|\\s+", ""));
    }
}