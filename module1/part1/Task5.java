package module1.part1;

public class Task5 {
    public static void main(String[] args) {
        int x = 1000000; //ввод необходимого кол-ва секунд
        int d, h, m, s;
        d = x / 60 / 60 / 24;           //дни
        h = x / 60 / 60 - d * 24;       //часы
        m = x / 60 - h * 60 - d * 24 * 60;                  // минуты
        s = x - h * 60 * 60 - m * 60 - d * 24 * 60 * 60;    //секунды
        System.out.print(d + " дней " + h + " ч " + m + " мин " + s + " с.");
    }
}
