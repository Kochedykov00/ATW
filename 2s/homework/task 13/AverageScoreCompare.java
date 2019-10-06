import java.util.Comparator;

public class AverageScoreCompare implements Comparator<Student> {
   
    public int compare(Student s1, Student s2) {
        if(s1.getAverageScore() > s2.getAverageScore()) {
            return 1;
        } else if (s1.getAverageScore() < s2.getAverageScore()) {
            return -1;
        } else return 0;
    }
}
