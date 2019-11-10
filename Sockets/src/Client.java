import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Date;

public class Client {

    public static void main (String [] args) throws IOException {
        final String HOST = "localhost";
        final int PORT = 1234;
        Socket s = new Socket(HOST,PORT);
        InputStream is = s.getInputStream();
        while (true) {
            int x = is.read();
            System.out.println("Received" + x + "on" + new Date());
        }
    }
}
