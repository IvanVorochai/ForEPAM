package module5.part5;

//Создать консольное приложение, удовлетворяющее следующим требованиям:
//        • Корректно спроектируйте и реализуйте предметную область задачи.
//        • Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
//        проектирования.
//        • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
//        • для проверки корректности переданных данных можно применить регулярные выражения.
//        • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
//        • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
//Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
//(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
//и упаковка.
//Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
//подарок). Составляющими целого подарка являются сладости и упаковка

import java.util.Objects;
import java.util.Set;

public class FlowerComposition {

    private Set<Flower> flower;
    private Set<PackageEnum> packageEnums;

    public void setFlower(Set<Flower> flower) {
        this.flower = flower;
    }

    public void setPackageEnums(Set<PackageEnum> packageEnums) {
        this.packageEnums = packageEnums;
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "flower=" + flower +
                ", packageEnums=" + packageEnums +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerComposition that = (FlowerComposition) o;
        return Objects.equals(flower, that.flower) && Objects.equals(packageEnums, that.packageEnums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flower, packageEnums);
    }
}
