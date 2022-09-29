package module5.part1;

import java.util.List;

public class TextFile extends FileName {  //наследование

    public TextFile(FileName parent) {
        super(false, parent);
    }

    public TextFile() {
        super(false, null);
    }

    @Override                           //полиморфизм
    public FileName create(String name) {
        FileName file = new TextFile();
        file.setName(name);
        return file;
    }

    @Override
    public void addContent(FileName file) {
        System.out.println("Добавление файла не поддеоживается");
    }

    @Override
    public void delete() {
        List<FileName> parentList = ((Directory) getParent()).getFiles();
        parentList.remove(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
