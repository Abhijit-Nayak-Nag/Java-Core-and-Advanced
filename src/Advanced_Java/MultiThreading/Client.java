package Advanced_Java.MultiThreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
        public static void main(String[] args) throws IOException {
            Socket socket=new Socket("localhost", 12345);
            BufferedReader in= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out= new PrintWriter(socket.getOutputStream(), true);
            System.out.println("Hello from Client ");
            String response= in.readLine();
            System.out.println("Received from server : " + response);
        }
    }
