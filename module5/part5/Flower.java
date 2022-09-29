package module5.part5;

public enum Flower {
    MARGARITKA(3.30),
    ROZE_WHITE(5.00),
    ROZE_RED(5.00),
    ROZE_PINK(5.00),
    LANDYSHI(5.00),
    LILY(4.44),
    ROMASHKA(3.50),
    IRISY(4.50),
    GLADIOLUS(5.50);

    private double cost;

    Flower(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
