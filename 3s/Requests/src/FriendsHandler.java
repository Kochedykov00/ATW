import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class FriendsHandler {

    public void service(Map<String,String> params) throws IOException{

        ArrayList<User> u = new FriendsDAO().getFriendsById(params.get("id"));
        CreatePage.createFriendsPage(u);
    }
}
