package module5.part4.bean;

import module5.part4.Treasure;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Создать консольное приложение, удовлетворяющее следующим требованиям:
//        • Приложение должно быть объектно-, а не процедурно-ориентированным.
//        • Каждый класс должен иметь отражающее смысл название и информативный состав.
//        • Наследование должно применяться только тогда, когда это имеет смысл.
//        • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//        • Классы должны быть грамотно разложены по пакетам.
//        • Консольное меню должно быть минимальным.
//        • Для хранения данных можно использовать файлы.
//
//        Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//        дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//        выбора сокровищ на заданную сумму.
public class DragonCave {
    private String DragonName;
    private List<Treasure> treasureList;

    public DragonCave(String dragonName, List<Treasure> treasureList) {
        DragonName = dragonName;
        this.treasureList = treasureList;
    }

    public String getDragonName() {
        return DragonName;
    }

    public void setDragonName(String dragonName) {
        DragonName = dragonName;
    }

    public List<Treasure> getTreasureList() {
        return treasureList;
    }

    public void setTreasureList(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    @Override
    public String toString() {
        return "DragonTreasure{" +
                "DragonName='" + DragonName + '\'' +
                ", treasure=" + treasureList +
                '}';
    }

    public void showTheRichestTreasure() throws Exception {
        Treasure theRichest = treasureList.get(0);
        for (Treasure treasure : treasureList) {
            if (theRichest.getCost() < treasure.getCost()) {
                theRichest = treasure;
            }
        }
        System.out.println("Самое драгоценное сокровище - это " + theRichest);
    }

    public void treasureForAGivenAmount() throws Exception {
        int sum = 5000;
        sum = Integer.parseInt(JOptionPane.showInputDialog("Введите сумму: "));
        System.out.println(sum + " ");
        List<Treasure> result = new ArrayList<>();
        int currentSum = 0;

        for (int i = 0; i < treasureList.size(); i++) {
            int difference = sum - currentSum;
            int index;
            index = (int) (Math.random() * 106);

            if (difference >= treasureList.get(index).getCost()) {
                result.add(treasureList.get(index));
                currentSum += treasureList.get(index).getCost();
            } else {
                continue;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(result);
        System.out.println(stringBuilder);
        System.out.println("При продаже вы заработаете " + currentSum + " " + TreasureType.COIN);
    }
}

