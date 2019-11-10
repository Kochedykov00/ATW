import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {

    public static void main (String [] args) throws IOException, InterruptedException {
        final int PORT = 1234;
        ServerSocket ss = new ServerSocket(PORT);
        System.out.println("Start on " + PORT);
        System.out.println("waiting for client...");
        Socket s = ss.accept();
        System.out.println("connected");
        OutputStream os = s.getOutputStream();
        Random r = new Random();
        while (true) {
            (new Thread(new Connection(s))).start();
        }

    }
}
