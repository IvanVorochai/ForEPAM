package module4.part2.task2;

public class Wheel {

    private TypeWheel wheelBrand;
    private QualityTypeWheel type;

    public Wheel() {
    }

    public Wheel(TypeWheel wheelBrand) {
        this.wheelBrand = wheelBrand;
    }

    public Wheel(QualityTypeWheel type) {
        this.type = type;
    }

    public Wheel(TypeWheel wheelBrand, QualityTypeWheel type) {
        this.wheelBrand = wheelBrand;
        this.type = type;
    }

    public TypeWheel getWheelBrand() {
        return wheelBrand;
    }

    public void setWheelBrand(TypeWheel wheelBrand) {
        this.wheelBrand = wheelBrand;
    }

    public QualityTypeWheel getType() {
        return type;
    }

    public void setType(QualityTypeWheel type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Wheel{" +
                "wheelBrand=" + wheelBrand +
                ", type=" + type +
                '}';
    }
}
