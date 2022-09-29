package module5.part5;

public enum PackageEnum {
    WOOD_PACKAGE(15.00),
    PAPER_PACKAGE(3.00),
    ORGANZA(5.00);


    private Double cost;

    PackageEnum(Double cost) {
        this.cost = cost;
    }

    PackageEnum() {
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
