public class FacadeOrchestrator {
    StreamerCMD cmd1 = new StreamerCMD();
    UserCMD cmd2 = new UserCMD();
    void HandleCmd(String str, StreamersManager ST1, StreamsManager ST2, UserManager ST3){
        String[] words = str.split(" ");
        int Id = Integer.parseInt(words[0]);
        for(Streamer s : ST1.getStreamers())
            if(s.getId() == Id)
                cmd1.handleCMD(s, ST2, str);
        for(User u : ST3.getUsers())
            if(u.getId() == Id)
                cmd2.handleCMD(u, ST2, str);




    }


}
