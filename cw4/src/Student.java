import java.util.ArrayList;
public class Student {
    public String fname;
    public String Iname;
    public String indexNumber;
    public String email;
    public String address;
    public ArrayList<Double> grades;

    public double calculateAverageGrade() {

        if (grades == null || grades.isEmpty()) {
            throw new IllegalArgumentException("Student musi mieć przynajmniej jedną ocenę.");
        }
        if (grades.size() > 20) {
            throw new IllegalArgumentException("Student może mieć maksymalnie 20 ocen.");
        }

        double avg = 0;
        for (int i = 0; i < grades.size(); i++) {
            avg += grades.get(i);
        }

        double average = avg / grades.size();
        return Math.round(average * 100.0) / 100.0;
    }
}


