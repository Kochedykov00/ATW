import java.io.IOException;
import java.util.Scanner;

public class Main {



        public static void main(String [] args) throws IOException {
            Dispatcher d = new Dispatcher();
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            String request = scanner.nextLine();
            if ("exit".equals(request)) {
                stop = true;
            }
            else {
                d.process(request);
            }

        }
    }

}

