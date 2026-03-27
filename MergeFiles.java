import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {

        try {
            // Open two files
            FileInputStream fin1 = new FileInputStream("file1.txt");
            FileInputStream fin2 = new FileInputStream("file2.txt");

            int ch;

            System.out.println("Merged File Content:\n");

            // Read first file
            while ((ch = fin1.read()) != -1) {
                System.out.print((char) ch);
            }

            // Read second file
            while ((ch = fin2.read()) != -1) {
                System.out.print((char) ch);
            }

            // Close files
            fin1.close();
            fin2.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
