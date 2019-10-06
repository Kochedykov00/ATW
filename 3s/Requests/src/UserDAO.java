import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserDAO {

    static ArrayList<User> users = new ArrayList<>();

    public static User getUserById(String id) throws IOException {
        Scanner sc = new Scanner(new File("users.txt"));

        while(sc.hasNextLine()) {
            String[] data = sc.nextLine().split("-");
            users.add(new User(data[0], data[1], data[2],Integer.parseInt(data[3])));
        }

        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}




