import java.io.*;

public class ProiectPOO {

    public static void main(String[] args) {
        if(args == null) {
            System.out.println("Nothing to read here");
            return;
        }
        StreamersManager ST1 = StreamersManager.getInstance();
        StreamsManager ST2 = StreamsManager.getInstance();
        UserManager ST3 = UserManager.getInstance();

        String csvFile1 = "src/main/resources/";
        String csvFile2 = "src/main/resources/";
        String csvFile3 = "src/main/resources/";
        String comenziFile = "src/main/resources/";
        csvFile1 = csvFile1.concat(args[0]);
        csvFile2 = csvFile2.concat(args[1]);
        csvFile3 = csvFile3.concat(args[2]);
        comenziFile = comenziFile .concat(args[3]);

        try {
            OperatingSystemFactory osf = new OperatingSystemFactory();
            tip obj;
            //streamers
            BufferedReader reader = new BufferedReader(new FileReader(csvFile1));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null){
                // am avut intreaga linie din fisier si pentru a putea sa o impart
                // in functie de tip, am sters "
                String replace = line.replace("\"", "");
                String[] words = replace.split(",");
                // in words sunt stocate type-ul, id-ul si numele
                obj = osf.getInstance("Streamer");
                ((Streamer)obj).setType(Integer.parseInt(words[0]));
                ((Streamer)obj).setId(Integer.parseInt(words[1]));
                ((Streamer)obj).setName(words[2]);
                ST1.addStreamer(((Streamer)obj));
            }
            reader.close();


//            for (Streamer streamer : ST1.getStreamers()) {
//                System.out.print(streamer.getId());
//                // folosiți obiectul currentStreamer aici
//            }

            //streams
            reader = new BufferedReader(new FileReader(csvFile2));
            reader.readLine();
            while ((line = reader.readLine()) != null){
                String replace = line.replace("\"", "");
                String[] words = replace.split(",");
                obj = osf.getInstance("Stream");
                ((Stream)obj).setType(Integer.parseInt(words[0]));
                ((Stream)obj).setId(Integer.parseInt(words[1]));
                ((Stream)obj).setStreamGenre(Integer.parseInt(words[2]));
                ((Stream)obj).setNoOfStreams(Long.parseLong(words[3]));
                ((Stream)obj).setStreamerId(Integer.parseInt(words[4]));
                ((Stream)obj).setLength(Long.parseLong(words[5]));
                ((Stream)obj).setDateAdded(Long.parseLong(words[6]));
                ((Stream)obj).setName(words[7]);
                ST2.addStream(((Stream)obj));
            }
            reader.close();


            //users
            reader = new BufferedReader(new FileReader(csvFile3));
            reader.readLine();
            while ((line = reader.readLine()) != null){
                String[] words = line.split(",");
                for(int i = 0; i < words.length; i++)
                    words[i] = words[i].replace("\"", "");
                String[] liveuri = words[2].split(" ");
                obj = osf.getInstance("User");
                ((User)obj).setId(Integer.parseInt(words[0]));
                ((User)obj).setName(words[1]);
                for(int i = 0; i < liveuri.length; i++ )
                    ((User)obj).addStreamId(Integer.parseInt(liveuri[i]));
                ST3.addUser(((User)obj));
            }
            reader.close();

            reader = new BufferedReader(new FileReader(comenziFile));
            while ((line = reader.readLine()) != null){
                new FacadeOrchestrator().HandleCmd(line, ST1, ST2, ST3);
            }
            reader.close();

            //comenzi



        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }
}
