package module5.part1;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileName {
    private final List<FileName> files;

    public Directory(String name, FileName parent) {
        super(true, parent);
        this.setName(name);
        this.files = new ArrayList();
        if (parent != null) {
            ((Directory) parent).getFiles().add(this);
        }
    }

    public List<FileName> getFiles() {
        return files;
    }

    @Override
    public FileName create(String name) {
        return new Directory(name, this);
    }

    public void addContent(FileName file) {
        file.setParent(this);
        this.files.add(file);
    }

    @Override
    public void delete() {
        List<FileName> parentList = ((Directory) getParent()).getFiles();
        if (parentList != null) {
            parentList.remove(this);
        }
    }

    @Override
    public String toString() {
        return "Directory " + getName() + " {\n" +
                files +
                "}\n";
    }
}
