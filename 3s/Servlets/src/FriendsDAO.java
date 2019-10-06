import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendsDAO {

    static ArrayList<Subscrition> friends = new ArrayList<>();
    static ArrayList<Profile> users = new ArrayList<>();

    public static ArrayList<Profile> getFriendsById(String id) throws IOException {


        ArrayList<Profile> friend = new ArrayList<>();

        friends.add(new Subscrition ("1","2"));
        friends.add(new Subscrition ("2","1"));
        friends.add(new Subscrition ("1","3"));
        friends.add(new Subscrition ("3","1"));



        users.add(new Profile("1","Sasha","Sterlitamak",Integer.parseInt("2000")));
        users.add(new Profile("2","Rodya","Kazan",Integer.parseInt("2000")));
        users.add(new Profile("3","Ilnaz","Nizhnekamsk",Integer.parseInt("2000")));
        users.add(new Profile("4","Lenches","Sterlitamak",Integer.parseInt("2000")));
        users.add(new Profile("5","Ramil","Sterlitamak",Integer.parseInt("2000")));


        for (Profile user : users) {
            if (user.getId().equals(id)) {
                for (Subscrition sub: friends) {
                    if (sub.getFollower().equals(id)){
                        for (Subscrition sub1: friends) {
                            if (sub1.getFollowing().equals(id) && sub1.getFollower().equals(sub.getFollowing())){
                                Profile p = new ProfileDAO().getUserById(sub1.getFollower());
                                friend.add(p);
                            }
                        }
                    }
                }
            }
        }
        return friend;
    }
}
