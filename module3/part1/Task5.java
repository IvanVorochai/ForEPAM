package module3.part1;

//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.
public class Task5 {
    public static void main(String[] args) {
        String str = "     Hello        world  !!!   ";
        str = str.trim();
        //str = str.replaceAll("( )+", " ");
        str = str.replaceAll("\\s+", " ");
        System.out.println("Result: " + str);
    }
}