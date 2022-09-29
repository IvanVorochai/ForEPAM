package module5.part1;

public class Runner {
    public static void main(String[] args) {

        FileName text1 = new TextFile();
        text1.setName("QWWE");
        text1.setContent("Polina");
        text1.toConsole();

        FileName text2 = text1.create("222");
        text2.toConsole();

        FileName dir1 = new Directory("Dir1", null);
        FileName dir2 = new Directory("Dir2", dir1);
        FileName dir3 = new Directory("Dir3", dir2);

        dir2.addContent(text2);
        dir2.addContent(text1);
        dir1.toConsole();


    }
}