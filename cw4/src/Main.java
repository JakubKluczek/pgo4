import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       Student st=new Student();
       st.grades= new ArrayList<>();
       st.grades.add(4.5);
       st.grades.add(3.5);
       st.grades.add(5.0);

    try {
        double srednia = st.calculateAverageGrade();
        System.out.println("średnia = " + srednia);
    }catch(IllegalArgumentException e){
        System.out.println("Błąd: " + e.getMessage());
        }

    StudentGroup group = new StudentGroup();
        try {
            group.addStudent("Jan Kowalski");
            group.addStudent("Anna Nowak");
            group.addStudent("Jan Kowalski");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }


    }
}

