import java.util.Collection;
import java.util.List;


public class LinkedList<T> extends LinkedCollection<T> implements List<T> {

    private Elem<T> head;
    private int size;

    public LinkedList(){
        super();
    }

    

    @Override
    public T get(int index) {
        Elem<T> h = head;
        for (int i = 0; i < index; i++) {
            h = h.getNext();
        }
        return h.getValue();
    }

    @Override
    public T set(int index, T element) {
        Elem<T> h = head;
        for (int i = 0; i < index; i++) {
            h = h.getNext();
        }
        T res = h.getValue();
        h.setValue(element);
        return res;
    }

    @Override
    public void add(int index, T element) {
        if(index <= realSize) {
            if(realSize == 0) {
                head = new Elem<>(element, null);
                realSize++;
                return;
            }
            Elem<T> h = head;
            for (int i = 1; i < index - 1; i++) {
                h = h.getNext();
            }
            Elem<T> curr = h.getNext();
            h.setNext(new Elem(element, curr));
            realSize++;
        }
    }

    @Override
    public T remove(int index) {
        Elem<T> h = head;
        for (int i = 0; i < index; i++) {
            h = h.getNext();
        }
        head = head.deleteK(h.getValue());
        return h.getValue();
    }

    @Override
    public int indexOf(Object o) {
        Elem<T> h = head;
        int index = 0;
        while(h.getNext() != null) {
            if (h.getValue().equals(o)) {
                return index;
            }
            index++;
            h = h.getNext();
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        Elem<T> h = head;
        int res = -1;
        for(int i = 0; i < realSize; i++) {
            if(h.getValue().equals(o)) {
                res = i;
            }
            h = h.getNext();
        }
        return res;
    }

    
}
