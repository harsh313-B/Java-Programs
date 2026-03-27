import java.io.*;

public class pp1{
    public static void main(String []args)
    {
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try{
            fin = new FileInputStream("file1.txt");
            fout = new FileOutputStream("file2.txt");

            int ch;
            while((ch = fin.read()) != -1)
            {
                fout.write(ch);
            }

            System.out.print("Done");
        }
        catch(IOException e)
        {
            System.out.print(e);
        }

        finally{
            try{
                if (fin != null)
                    fin.close();
                if (fout != null)
                    fout.close();
            }
            catch(Exception e)
            {}
        }
    }
}