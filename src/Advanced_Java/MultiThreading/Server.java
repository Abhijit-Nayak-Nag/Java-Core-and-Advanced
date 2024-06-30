package Advanced_Java.MultiThreading;
import java.io.*;
import java.net.*;
import java.sql.ClientInfoStatus;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(12345);
        System.out.println("Server Started, waiting for clients....");
        while(true){
            Socket clientsocket=serverSocket.accept();
            System.out.println("Client Connected: " + clientsocket);
            ClientHandler clientHandler=new ClientHandler(clientsocket);
            clientHandler.start();
        }

    }

}
class ClientHandler extends Thread {
    private Socket clientSocket;
    public ClientHandler(Socket clientSocket){
    }
    public void run(){
        try{
            BufferedReader in= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out= new PrintWriter(clientSocket.getOutputStream(), true);
            String message;
            while((message= in.readLine())!=null){
                System.out.println("Received from client: " + message);
                System.out.println("Server received: " + message);
            }
            clientSocket.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

