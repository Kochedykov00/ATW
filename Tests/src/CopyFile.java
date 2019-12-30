import java.io.*;

public class CopyFile {

    public static void main(String[] args) {
    }


    public void copy (InputStream inputStream, OutputStream outputStream, int nBytes) throws IOException {

        for (int i = 0; i < nBytes; i++) {
            outputStream.write(inputStream.read());
        }


    }

    public int cum5 (InputStream inputStream) {

        try {
//             return inputStream.read() + inputStream.read() + inputStream.read();
            /}/////////////...........................................

        catch (IOException e) {

        }
        return -2;
    }
