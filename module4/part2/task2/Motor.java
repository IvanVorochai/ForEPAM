package module4.part2.task2;

public class Motor {

    private String motor;

    public Motor() {
    }

    public Motor(String motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "motor='" + motor + '\'' +
                '}';
    }
}
