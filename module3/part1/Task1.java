package module3.part1;

//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Task1 {
    public static void main(String[] args) {

        String str = "ifIWereSultan,IWouldHaveThreeWives,AndBeByTripleBeautySurrounded";
        String[] splitString = str.split("(?=[A-Z])");
        String arrayToString = String.join("_", splitString);
        String toLowerString = arrayToString.toLowerCase();
        String result = toLowerString.substring(0, 1).toUpperCase() + toLowerString.substring(1);
        System.out.println(result);
    }
}