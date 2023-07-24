import java.util.ArrayList;
import java.util.List;

public final class UserManager {
    private static UserManager instance;
    private List<User> users;

    private UserManager() {
        users = new ArrayList<>();
    }

    public static UserManager getInstance() {
        if(instance == null){
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

}
