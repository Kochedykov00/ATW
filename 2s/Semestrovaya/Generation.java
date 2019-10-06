package Semestrovaya;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Generation {

    static Random random = new Random();
    static File file = new File("numbers.txt");
    static FileWriter fw;

    static {
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static BufferedWriter bw = new BufferedWriter(fw);

    public static void main(String[] args) throws Exception {
        createArray();
        bw.close();
        fw.close();
    }

    public static void createArray() throws Exception {
        int i = 50;
        int n = 100;
        for (; i > 0; i--) {
            int[] arr = new int[n];
            n +=150;
            writeToFile(arr);
        }
    }


    public static void writeToFile(int[] a) throws Exception {
        List <Integer> fill = new ArrayList <>();
        for ( int i = 0; i < a.length; i++ ) {
            fill.add(i + 1);
        }
        bw.write("\n");
        Collections.shuffle(fill);
        bw.write(fill.toString() + "");
    }
}



