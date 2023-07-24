import java.util.ArrayList;
import java.util.List;

public final class StreamsManager {
    private static StreamsManager instance;
    private List<Stream> streams;

    private StreamsManager(){
        streams = new ArrayList<>();
    }

    public static StreamsManager getInstance(){
        if (instance == null){
            instance = new StreamsManager();
        }
        return instance;
    }

    public void addStream(Stream stream) {
        streams.add(stream);
    }

    public List<Stream> getStreamers() {
        return streams;
    }
}
