package Semestrovaya;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ReaderList {

    public static LinkedList <Integer> addElem(File file, int line)

            throws IOException {

        Scanner scan = new Scanner(new File("numbers.txt"));
        String data = scan.nextLine();
        LinkedList <Integer>  ll = new LinkedList<>();

        for (int i = 1; i < line; i++) {
            data = scan.nextLine();
        }

        int[] arr = Arrays.stream(data.substring(1, data.length() - 1).split(", "))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++)
            ll.add(arr[i]);

        return ll;
    }
}

