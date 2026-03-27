import java.io.*;
import java.net.*;

// Client program
public class Client {

    public static void main(String[] args) {
        try {
            // Connect to server on localhost and port 5000
            Socket socket = new Socket("localhost", 5000);

            // Input and output streams
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            // Send message to server
            out.writeUTF("Hello Server!");

            // Receive response from server
            String response = in.readUTF();
            System.out.println("Server replies: " + response);

            // Close connection
            socket.close();

        } catch (IOException e) {
            System.out.println("Client Error: " + e);
        }
    }
}
