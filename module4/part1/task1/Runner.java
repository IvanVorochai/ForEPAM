package module4.part1.task1;

public class Runner {
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println(test);
        test.setA(5);
        test.setB(7);
        System.out.println(test);
        System.out.println(test.max());
        System.out.println(test.sum());
        test.print("hello");

        Test1 t = new Test1(8, 11);  //инициализация
        System.out.println(t);
    }
}
