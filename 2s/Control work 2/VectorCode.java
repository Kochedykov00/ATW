import java.util.LinkedList;
import java.util.Scanner;

public class VectorCode extends Elem {


    int length;
    Elem e;

    public VectorCode (int [] arr) {


        for (int i = 0; i < arr.length; i++){
            Elem head = null;
            if (arr[i] != 0) {
                e = new Elem;
                e.number = e.setNumber(i)
                e.value = e.setValue(arr[i]);
                e.next = head;
                head = e;
            }
            else {
                e.number = e.setNumber(0);
            }
            length++;

    }

        public int [] decode() {
        int [] arr;
        while (e  != null) {
            if (e.value != 0) {
                arr [e.number] = e.value;
            }
            else
                arr [e.number] = 0;
            e = e.next;
        }
        return arr;
        }



    public void insert (int k, int pos){
            while (pos != 1) {
                e = e.next
            }
            e.value = k;
        }

    void delete(int pos) {
            for (int i = 0; i < pos; i++) {
                e = e.next;
            }
            e.value = 0;
        }

        public void mult(int a, int c) {
            for (int i = 0; i < length; i++) {
                if (e.value == a) {
                    e.value = a*c;
                }
            }
            e = e.next;
        }


        }
}

