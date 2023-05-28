import java.util.ArrayList;

public class Student extends Person {
    public final String course;
    public final int fee;
    public final Credentials creds;

    private static String company = "Maxima"; // it doesn't be serialized

    public ArrayList<String> grades = new ArrayList<>();

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
