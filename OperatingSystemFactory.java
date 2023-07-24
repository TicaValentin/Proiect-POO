public class OperatingSystemFactory {
    public tip getInstance(String str){
        if(str.equals("Streamer"))
            return new Streamer();
        else if(str.equals("Stream"))
            return new Stream();
        else if(str.equals("User"))
            return new User();
        else
            return null;
    }
}
