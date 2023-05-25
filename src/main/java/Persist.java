import java.io.*;

public class Persist {
    public static void main(String args[]) {

        Credentials creds = new Credentials("login", "password");
        Student theStudent = new Student(1,"Kazantsev", "Java QA Automation", 0, creds);
        Student theStudentFromFile;
        String fileName = "student.txt";

        try (FileOutputStream fOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fOut)) {
            out.writeObject(theStudent);
            out.flush();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            theStudentFromFile = (Student)in.readObject();
            System.out.println(theStudentFromFile.id + " " + theStudentFromFile.name + " " + theStudentFromFile.course + " " + theStudentFromFile.fee);
            System.out.println(theStudentFromFile.creds.login + " " + theStudentFromFile.creds.password);
            for (String grade: theStudentFromFile.grades) {
                System.out.println(grade);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
