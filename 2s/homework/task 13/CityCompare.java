import java.util.Comparator;

public class CityCompare implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getCity().compareTo(s2.getCity());
    }
}
