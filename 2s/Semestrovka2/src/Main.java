import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        for (int k = 1; k < 51; k++) {

            int[] array = ReaderArray.addElem(new File("numbers.txt"), k);
            Search search = new Search();
            search.searchNode(12, array);


        }
        }
    }
