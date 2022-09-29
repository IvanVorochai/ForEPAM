package module5.part4.bean;

import module5.part4.Treasure;

public abstract class TreasureAbstract implements Treasure {

    private TreasureType type;
    private String name;
    private int cost;

    public TreasureAbstract() {
    }

    public TreasureAbstract(TreasureType type, String name, int cost) {
        this.type = type;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public TreasureType getType() {
        return type;
    }

    public void setType(TreasureType type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "GoldenTreasure{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

}
