public class UserCMD {

    void handleCMD(User u, StreamsManager ST2, String str){
        String[] words = str.split(" ");
        int Id = Integer.parseInt(words[0]);

        if(words[1].equals("LIST")){
            String output = "[";
            for(int idx : u.getStreams())
                for(Stream s : ST2.getStreamers())
                    if(idx == s.getId()){
//                        output = output.concat(String.valueOf(s.getId()));
                        System.out.println("5");
                    }
//                        System.out.print("\"id\":\"" + s.getId() + "\",\"name\":\"" + s.getName());
        }

    }

}
