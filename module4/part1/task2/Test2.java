package module4.part1.task2;

//2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//класса.
public class Test2 {
    private int a;
    private int b;

    public Test2() {         //пустой конструктор, в нутри которого можно поменять значения
        this.a = 1;
        this.b = 1;
    }

    public Test2(int a, int b) {     //конструктор c входными параметрами
        this.b = b;
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override                   //generate to string ()
    public String toString() {
        return "Test2{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

