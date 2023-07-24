public class Streamer implements tip {
    // pentru aceasta clasa am folosit desgin pattern-ul Singleton
    private int type;
    private int id;
    private String name;

    protected Streamer() {}

    public Streamer(int type, int id, String name) {
        this.type = type;
        this.id = id;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}