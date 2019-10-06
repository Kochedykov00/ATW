package Semestrovaya;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderArray {

    public static int[] addElem (File file, int line)
            throws IOException {

        Scanner scan = new Scanner(new File("numbers.txt"));
        String data = scan.nextLine();

        for (int i = 1; i < line; i++) {
            data = scan.nextLine();
        }

        int[] arr = Arrays.stream(data.substring(1, data.length() - 1).split(", "))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();

        return arr ;

    }
}
