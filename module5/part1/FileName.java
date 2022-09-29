package module5.part1;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.
public abstract class FileName {
    private final boolean isDirectory;
    private String name;
    private String content;
    private FileName parent;

    protected FileName(boolean isDirectory, FileName parent) {
        this.isDirectory = isDirectory;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileName getParent() {
        return parent;
    }

    public void setParent(FileName parent) {
        this.parent = parent;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    abstract public FileName create(String name);


    public FileName rename(String name) {
        setName(name);
        return this;
    }

    public void toConsole() {
        System.out.println(this);
    }

    public void addContent(String content) {
        this.content = this.content + content;
    }

    abstract public void addContent(FileName file);

    abstract public void delete();

    @Override
    public String toString() {
        if (parent != null) {
            return "File{" +
                    "isDirectory=" + isDirectory +
                    ", name='" + name + '\'' +
                    ", content='" + content + '\'' +
                    ", parent=" + parent.getName() +
                    '}';
        }
        return "File{" +
                "isDirectory=" + isDirectory +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", parent=" + parent +
                '}';
    }
}
