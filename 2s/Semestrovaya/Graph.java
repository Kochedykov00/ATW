package Semestrovaya;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {

    public int VERTEX_MAX = 15000;
    public Vertex[] vertexList;
    public int vertexActual;
    public int[][] matrix;

    Graph() {
        matrix = new int[VERTEX_MAX][VERTEX_MAX];
        for (int i = 1; i < VERTEX_MAX; i++)
            for (int j = 1; j < VERTEX_MAX; j++)
                matrix[i][j] = 0;
        vertexActual = 0;
        vertexList = new Vertex[VERTEX_MAX];
    }

    public Graph(Vertex[] vertexList, int vertexActual, int[][] matrix) {
        this.vertexList = vertexList;
        this.vertexActual = vertexActual;
        this.matrix = matrix;
    }

    public void addVertex(String label) {
        vertexList[++vertexActual] = new Vertex(label);
    }

    public void addEdge(int begin, int end) {
        matrix[begin][end] = 1;
        matrix[end][begin] = 0;
    }

    public boolean checkGraph() {
        int column = 0;
        int line = 0;
        for (int j = 1; j <= vertexActual; j++) {
            for (int i = 0; i <= vertexActual; i++) {
                if (matrix[j][i] == 0) {
                    column += 1;
                }
                if (matrix[i][j] == 0) {
                    line += 1;
                }
            }
            if (column == vertexActual && line == vertexActual)
                return true;
        }
        return false;
    }



    public void removeEdge(int b, int e){
        matrix[b][e] = 0;
        matrix[e][b] = 0;
    }

    private int getSuccessor (int v){
        for (int j = 1; j <= vertexActual; j++)
            if (matrix[v][j] == 1 && vertexList[j].isVisited == false)
                return j;
        return -1;
    }


    void dfs (int[] v){
        int iteration = 0;
        int min = 10001;
        for (int i = 0; i < v.length; i++) {
            iteration++;
            if (v[i] < min)
                min = v[i];
        }
        Stack<Integer> stack = new Stack<>();
        vertexList[min].setVisited(true);
        stack.push(min);
        int i = 1;
        while (!stack.isEmpty()) {
            iteration++;
            int current = stack.peek();
            int vertex = getSuccessor(current);
            if (vertex == -1)
                System.out.println(stack.pop());
            else  {
                vertexList[vertex].setVisited(true);
                stack.push(vertex);
            }
        }

        for (int j = 1; j < vertexActual; j++) {
            iteration++;
            vertexList[j].setVisited(false);
        }
        System.out.println(iteration);
    }

    void dfs (LinkedList < Integer > list) {
        int iteration = 0;
        int min = 10001;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min)
                min = list.get(i);
        }
        Stack<Integer> stack = new Stack<>();
        vertexList[min].setVisited(true);
        stack.push(min);
        int i = 1;


        while (!stack.isEmpty()) {
            iteration++;
            int current = stack.peek();
            int vertex = getSuccessor(current);
            if (vertex == -1)
                System.out.println(stack.pop());
            else {
                vertexList[vertex].setVisited(true);
                stack.push(vertex);
            }
        }
        for (int j = 1; j < vertexActual; j++) {
            iteration++;
            vertexList[j].setVisited(false);
        }
        System.out.println(iteration);

    }
}
