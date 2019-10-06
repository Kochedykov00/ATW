import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FriendsDAO {

    static ArrayList<Subscrition> friends = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<User> getFriendsById(String id) throws IOException {

        Scanner sc = new Scanner(new File("sub.txt"));
        Scanner sc1 = new Scanner(new File("users.txt"));
        ArrayList<User> friend = new ArrayList<>();


        while(sc.hasNextLine()) {
            String[] data = sc.nextLine().split("-");
            friends.add(new Subscrition (data[0], data[1]));
        }

        while(sc1.hasNextLine()) {
            String [] data1 = sc1.nextLine().split("-");
            users.add(new User(data1[0], data1[1], data1[2],Integer.parseInt (data1[3])));
        }

            for (User user : users) {
                if (user.getId().equals(id)) {
                    for (Subscrition sub: friends) {
                        if (sub.getFollower().equals(id)){
                            for (Subscrition sub1: friends) {
                                if (sub1.getFollowing().equals(id) && sub1.getFollower().equals(sub.getFollowing())){
                                    User u = new UserDAO().getUserById(sub1.getFollower());
                                    friend.add(u);
                                }
                            }
                        }
                    }
                }
                }
            return friend;
        }
}
