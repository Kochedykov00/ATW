package Semestrovaya;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;

public class MainList {

    public static void main(String[] args) throws IOException {


        for (int k = 2; k < 51; k++) {

            Graph g = new Graph();
            LinkedList<Integer> list = ReaderList.addElem(new File("numbers.txt"), k);

            for (int i = 1; i < list.size(); i++) {
                g.addVertex("It's vertex number" + " " + i);
            }

            for (int i = 1; i <= list.size(); i++) {
                Random random = new Random();
                int n = random.nextInt(4) + 2;
                for (int j = 1; j <= n; j++) {
                    Random rand = new Random();
                    int l = rand.nextInt((int) (list.size()) + 1);
                    g.addEdge(i, l);
                    if (g.checkGraph())
                        g.removeEdge(i, l);
                }
            }


            long before = System.nanoTime();
            g.dfs(list);
            long after = System.nanoTime();
            long diff = after - before;
            System.out.println(diff);
        }
    }

}
