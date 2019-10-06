package Stack;

import java.io.NotActiveException;
import java.util.Queue;

public class ArrayQueue<T> implements Queue<T> {

    public ArrayQueue(T[] array, int realSize) {
        this.array = array;
        this.realSize = realSize;
    }

    public T[] getArray() {
        return array;
    }

    public int getRealSize() {
        return realSize;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void setRealSize(int realSize) {
        this.realSize = realSize;
    }

    T [] array;
    int realSize;

    void offer(T a) {
        array [realSize] = a;
		realsize++;
    }

    T poll() {
        if (array [0] == null) {
            return null;
        }
        else
            T head;
        T head = array[0];
            for (int i = 0; i < realSize - 1;i++){
				array [i] = array[i+1];
			}
			realSize--;
        return head;
    }

    T element() {
        try {
            return array [0];
        }
        catch (Exception e) {
            System.out.println("NO OBJECT");
        }
    }

    T peek () {
        if (array != null) {
            return array [0];
        }
        else return null;
    }

    T remove() {
        try {
            T head = array [0]
            array [realSize - 1]
            return head;
        }
        catch (Exception e) {
            System.out.println("NO OBJECT");
        }
    }
}
