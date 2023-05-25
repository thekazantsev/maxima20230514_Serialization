import java.io.*;

public class Persist{
    public static void main(String args[]){



        try {
            Credantials creds = new Credantials("login", "password");
            Student theStudent = new Student(1,"Kazantsev", "Java QA Automation", 0, creds);
            FileOutputStream fOut = new FileOutputStream("studentFOut.txt");
            ObjectOutputStream out = new ObjectOutputStream(fOut);
            out.writeObject(theStudent);
            out.flush();
//            out.close();

            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("studentFOut.txt"));
            Student theStudent = (Student)in.readObject();
            System.out.println(theStudent.id + " " + theStudent.name + " " + theStudent.course + " " + theStudent.fee);
            System.out.println(theStudent.creds.login + " " + theStudent.creds.password);
            for (String grade: theStudent.grades) {
                System.out.println(grade);
            }

            //Person somePerson = (Person) in.readObject();
            //System.out.println(somePerson.id + " " + somePerson.name);
            in.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
