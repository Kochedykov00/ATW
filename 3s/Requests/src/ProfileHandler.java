import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ProfileHandler {

    public void service(Map<String, String> params) throws IOException {


        if (params.containsKey("show_friends")) {
            User u = new UserDAO().getUserById(params.get("id"));
            ArrayList<User> list = new FriendsDAO().getFriendsById(params.get("id"));
            CreatePage.createProfilePageWithFriends(u, list);
        } else {
            User u = new UserDAO().getUserById(params.get("id"));
            CreatePage.createProfilePage(u);
        }

    }
}

