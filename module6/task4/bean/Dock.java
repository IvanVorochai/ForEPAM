package module6.task4.bean;

public class Dock {
    private int id;
    private Port port;

    public Dock(int id, Port port) {
        this.id = id;
        this.port = port;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("На пристани " + id + " \n");
        return string.toString();
    }
}
