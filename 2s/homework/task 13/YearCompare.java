import java.util.Comparator;

public class YearCompare implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getYear() > s2.getYear()) {
            return 1;
        } else if (s1.getYear() < s2.getYear()) {
            return -1;
        } else return 0;
    }
}
