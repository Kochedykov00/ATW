public class Student implements Comparable<Student> {

    private String fio;
    private int year;
    private String city;
    private int averageScore;

    public Student(String fio, int year, String city, int averageScore) {
        this.fio = fio;
        this.year = year;
        this.city = city;
        this.averageScore = averageScore;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int compareTo(Student o) {
        return this.getFio().compareTo(o.getFio());
    }
}

