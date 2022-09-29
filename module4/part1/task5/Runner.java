package module4.part1.task5;

////5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
////на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
////произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
////позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса
public class Runner {
    public static void main(String[] args) {
        Counter counter0 = new Counter();
        Counter counter1 = new Counter(0, 10, 1, 5);  //инициализания значений по умолчанию
        Counter counter2 = new Counter(0, 10, 1, 10);


        counter1.plus();
        System.out.println(counter1);
        counter1.plus();
        System.out.println(counter1);
        System.out.println();

        System.out.println(counter2);
        counter2.plus();
        System.out.println(counter2);
        counter2.plus();
        System.out.println(counter2);
        counter2.minus();
        System.out.println(counter2);
        counter2.minus();
        System.out.println(counter2);
        counter2.minus();
        System.out.println(counter2);
        System.out.println();

        counter1.setMax(99);               //инициализания значений производно
        counter1.setMin(50);
        counter1.setPresentValue(50);
        counter1.setVariable(5);

        System.out.println(counter1);
        counter1.plus();
        System.out.println(counter1);
        counter1.plus();
        System.out.println(counter1);
        counter1.setVariable(20);
        counter1.minus();
        System.out.println(counter1);
    }
}