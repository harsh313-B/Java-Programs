import java.io.*;

public class FileCopy {
    public static void main(String[] args) {

        try {
            // Create file streams
            FileInputStream fin = new FileInputStream("source.txt");
            FileOutputStream fout = new FileOutputStream("destination.txt");

            int ch;

            // Read and write data
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }

            System.out.println("File copied successfully.");

            // Close files
            fin.close();
            fout.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
