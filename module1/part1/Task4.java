package module1.part1;

public class Task4 {
    public static void main(String[] args) {
//first method
        double x = 123.456;
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
//second method
        String xStr = String.valueOf(x);
        String[] array = xStr.split("\\.");
        System.out.println(array[1] + "." + array[0]);
    }
}
