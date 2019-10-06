package st;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Kochedykov", 2000, "Sterlitamak", 300));
        students.add(new Student("Sharifullin", 2000, "Kazan", 400));
        students.add(new Student("Ryzhakov", 2000, "Nizhnekamsk", 450));

        Collections.sort(students);
        Collections.sort(students, (s1, s2) -> {
                    return s1.getCity().compareTo(s2.getCity());
                }
        );
        Collections.sort(students, new YearCompare());
        Collections.sort(students, new AverageScoreCompare());
      
    }
    }
}
