import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {

        try {
            // Create object
            Student s = new Student(101, "Rahul");

            // File output stream
            FileOutputStream fout = new FileOutputStream("data.txt");

            // Object output stream
            ObjectOutputStream out = new ObjectOutputStream(fout);

            // Write object to file
            out.writeObject(s);

            out.close();
            fout.close();

            System.out.println("Object Serialized Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
