public class Stream implements tip {
    private int type;
    private int id;
    private int streamGenre;
    private long noOfStreams;
    private int streamerId;
    private long length;
    private long dateAdded;
    private String name;

    // Constructor fara parametrii
    public Stream() {}

    // Constructor cu parametri
    public Stream(int type, int id, int streamGenre, long noOfStreams, int streamerId, long length, long dateAdded, String name) {
        this.type = type;
        this.id = id;
        this.streamGenre = streamGenre;
        this.noOfStreams = noOfStreams;
        this.streamerId = streamerId;
        this.length = length;
        this.dateAdded = dateAdded;
        this.name = name;
    }

    // Getters
    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public int getStreamGenre() {
        return streamGenre;
    }

    public long getNoOfStreams() {
        return noOfStreams;
    }

    public int getStreamerId() {
        return streamerId;
    }

    public long getLength() {
        return length;
    }

    public long getDateAdded() {
        return dateAdded;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setType(int type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStreamGenre(int streamGenre) {
        this.streamGenre = streamGenre;
    }

    public void setNoOfStreams(long noOfStreams) {
        this.noOfStreams = noOfStreams;
    }

    public void setStreamerId(Integer streamerId) {
        this.streamerId = streamerId;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setDateAdded(long dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setName(String name) {
        this.name = name;
    }
}
