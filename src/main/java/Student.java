import java.util.ArrayList;

public class Student extends Person {
    String course;
    int fee;
    Credentials creds;

    static String company = "Maxima"; // it won't be serialized

    ArrayList<String> grades = new ArrayList<>();

    public Student(int id, String name, String course, int fee, Credentials creds) {
        super(id,name);

        this.course = course;
        this.fee = fee;
        this.creds = creds;

        this.grades.add("5");
        this.grades.add("5");
        this.grades.add("5");
        this.grades.add("5");
    }
}
