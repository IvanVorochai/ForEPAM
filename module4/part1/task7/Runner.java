package module4.part1.task7;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.
public class Runner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.toString(triangle));
        System.out.println();

        Triangle triangle1 = new Triangle(new double[]{0, 0}, new double[]{10, 0}, new double[]{20, 0});
        System.out.println(triangle1.toString(triangle1));
    }
}
