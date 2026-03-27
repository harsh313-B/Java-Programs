import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        // ServerSocket is closed automatically when main exits or an exception occurs
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected.");

                ClientHandler handler = new ClientHandler(clientSocket);
                handler.start();
            }

        } catch (IOException e) {
            System.out.println("Server Error: " + e);
        }
    }
}

class ClientHandler extends Thread {
    Socket socket;

    ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String message = in.readUTF();
            System.out.println("Client says: " + message);

            out.writeUTF("Hello Client, your message was received!");

            socket.close();

        } catch (IOException e) {
            System.out.println("Client Handling Error: " + e);
        }
    }
}
