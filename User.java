import java.util.ArrayList;
import java.util.List;

public class User implements tip {
    private int id;
    private String name;
    private List<Integer> streams;

    // Constructor fara parametrii
    public User() {
        streams = new ArrayList<>();
    }

    // Constructor cu parametrii
    public User(int id, String name, List<Integer> streams) {
        this.id = id;
        this.name = name;
        this.streams = streams;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getStreams() {
        return streams;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreams(List<Integer> streams) {
        this.streams = streams;
    }

    public void addStreamId(int idStream){
        this.streams.add(idStream);
    }
}