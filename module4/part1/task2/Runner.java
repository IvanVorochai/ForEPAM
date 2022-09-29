package module4.part1.task2;

public class Runner {
    public static void main(String[] args) {
        Test2 test = new Test2(10, 20);        //инициализация члена класса по умолчанию
        System.out.println(test);

        Test2 test1 = new Test2();        //инициализация члена класса по умолчанию
        System.out.println(test1);

        test.setA(2);
        test.setB(3);

        System.out.println(test);           //без get

        System.out.println(test.getA());  //использую get
        System.out.println(test.getB());

    }
}
