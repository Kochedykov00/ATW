package Stack;


public class ArrayStack <T> implements IStack <T>  {

    T [] array;
    int realSize;

    public ArrayStack(T[] array, int realSize) {
        this.array = array;
        this.realSize = realSize;
    }

    void push(T a) {
        array [realSize] = a;
    }

    T peek() {
        return array[realSize - 1];
    }

    T pop() {
        T k = array[realSize - 1];
        array [realSize - 1] = null;
        return k;
    }

    boolean isEmpty() {
        if (array = null ) {
            return true;
        }
        return false;
    }
}
