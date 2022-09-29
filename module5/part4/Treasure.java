package module5.part4;

import module5.part4.bean.TreasureType;

public interface Treasure {
    TreasureType getType();

    String getName();

    int getCost();

    void setType(TreasureType type);

    void setName(String name);

    void setCost(int cost);

}
