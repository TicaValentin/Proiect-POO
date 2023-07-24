import java.util.ArrayList;
import java.util.List;

public final class StreamersManager {
    private static StreamersManager instance;
    private List<Streamer> streamers;

    private StreamersManager() {
        streamers = new ArrayList<>();
    }

    public static StreamersManager getInstance() {
        if (instance == null) {
            instance = new StreamersManager();
        }
        return instance;
    }

    public void addStreamer(Streamer streamer) {
        streamers.add(streamer);
    }

    public List<Streamer> getStreamers() {
        return streamers;
    }
}