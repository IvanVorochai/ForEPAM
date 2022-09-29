package module4.part1.task6;

//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.
public class Runner {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);

        Time time = new Time(22, 41, 0);        //метод задавания времени через поля
        System.out.println(time);

        time.AddHour(3);
        time.AddMinute(5);
        time.AddSecond(30);
        time.AddSecond(31);
        time.AddSecond(32);

        System.out.println(time);

        time.setH(5);                           //метод задавания времени через setter
        time.setM(10);
        time.setS(15);
        System.out.println(time);

    }
}
