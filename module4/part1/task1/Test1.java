package module4.part1.task1;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.
public class Test1 {
    private int a;
    private int b;

    public Test1() {        //конструктор
    }

    public Test1(int a, int b) {        //метод вывода на экран и изменения переменных
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }       //метод вывода на экран и изменения переменных через getter и setter

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum() {          //метод нахождения суммы
        return a + b;
    }

    public int max() {
        return Math.max(a, b);
    }       //метод нахлждения max элемента

    public void print(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
