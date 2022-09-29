package module5.part4;

import module5.part4.bean.DragonCave;
import module5.part4.util.TreasureFileReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws Exception {
        DragonCave dragonCave = init("c:\\Users\\User\\IdeaProjects\\untitled\\" +
                "src\\module5\\part4\\treasure.txt"); //исправить путь, если не найдет файл

        System.out.println(dragonCave);         //список всех сокровищ
        dragonCave.showTheRichestTreasure();    //самое дорогое
        dragonCave.treasureForAGivenAmount();   //вывод сокровищ на заданную сумму
    }

    private static DragonCave init(String filePath) throws FileNotFoundException {
        TreasureFileReader reader = new TreasureFileReader();
        List<Treasure> treasureList = reader.getTreasureListFromFile(filePath);
        return new DragonCave("Black Dr.", treasureList);
    }
}

//    private static DragonCave init2(String filePath) {
//        TreasureFileReader reader = new TreasureFileReader();
//        List<Treasure> treasureList = new ArrayList<>();
//        treasureList.addAll(reader.getTreasureListFromFile(filePath));
//        DragonCave dragonCave = new DragonCave("Black Dragon.", treasureList);
//        return dragonCave;
//    }

