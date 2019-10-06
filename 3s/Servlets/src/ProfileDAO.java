import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProfileDAO {

    static ArrayList<Profile> profiles = new ArrayList<>();

    public static Profile getUserById(String id) throws IOException {

        profiles.add(new Profile("1","Sasha","Sterlitamak",Integer.parseInt("2000")));
        profiles.add(new Profile("2","Rodya","Kazan",Integer.parseInt("2000")));
        profiles.add(new Profile("3","Ilnaz","Nizhnekamsk",Integer.parseInt("2000")));
        profiles.add(new Profile("4","Lenches","Sterlitamak",Integer.parseInt("2000")));
        profiles.add(new Profile("5","Ramil","Sterlitamak",Integer.parseInt("2000")));

        for (Profile profile : profiles) {
            if (profile.getId().equals(id)) {
                return profile;
            }
        }
        return null;
    }
}
