import java.io.*;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void copyFile(String filename) throws IOException {

        PrintWriter pw = new PrintWriter(filename);
        URL url = new URL("file:///D:/inputAnOutput/copy.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        String s = br.readLine();
        while (s != null) {
            pw.println(s);
            s = br.readLine();
        }
    }

    public static void downloadPage(String filename) throws IOException {

        URL url = new URL("http://winda.lionovsky.us/");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(url.openConnection().getInputStream(), "UTF-8"));
        PrintWriter pw = new PrintWriter(filename);
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            pw.println(line);
        }
    }

    public static void downloadJPEG(String filename) throws IOException {

        URL url = new URL("https://upload.wikimedia.org/wikipedia/ru/3/3a/%D0%9F%D1%80%D0%B8%D0%BC%D0%B5%D1%80_.jpg");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        RandomAccessFile file = new RandomAccessFile(filename, "rw");
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            file.write(line.getBytes());
        }
        file.close();
    }

    public static void downloadEXP(String filename) throws IOException {

        URL url = new URL("http://winda.lionovsky.us/");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        RandomAccessFile file = new RandomAccessFile(filename, "rw");
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            Pattern pattern = Pattern.compile("^.*jpeg.*$");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                file.write(line.getBytes());
            }
            file.close();
        }
    }



    public static void main(String[] args) throws IOException {

        downloadPage("copy.txt");
        copyFile("copy2.txt");
        downloadJPEG("jpegDemo.jpg");
        downloadEXP("jpegDemo2.jpg");

    }
}
