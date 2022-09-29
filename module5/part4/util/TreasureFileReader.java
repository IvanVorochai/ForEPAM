package module5.part4.util;

import module5.part4.Treasure;
import module5.part4.bean.GoldenTreasure;
import module5.part4.bean.SilverTreasure;
import module5.part4.bean.TreasureType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreasureFileReader {
    public List<Treasure> getTreasureListFromFile(String filePath) throws FileNotFoundException {
        List<Treasure> treasureList = new ArrayList<>();
        //read file

        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.startsWith("#")) {
                continue;
            } else {
                List<String> currentLineList = Arrays.asList(line.split(";"));
                Treasure treasure;

                switch (currentLineList.get(0)) {
                    case "Golden":
                        treasure = new GoldenTreasure();
                        break;
                    case "Silver":
                        treasure = new SilverTreasure();
                        break;
                    default:
                        treasure = new GoldenTreasure();
                }

                treasure.setType(TreasureType.valueOf(currentLineList.get(1)));
                treasure.setName(currentLineList.get(2));
                treasure.setCost(Integer.parseInt(currentLineList.get(3)));
                treasureList.add(treasure);
            }
        }
        return treasureList;
    }
}