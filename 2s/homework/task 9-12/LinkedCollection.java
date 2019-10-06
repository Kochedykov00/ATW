import java.util.Collection;
import java.util.Iterator;

public class LinkedCollection<T> extends AbstractCollection<T> implements Collection<T> {

    private Elem<T> head;
    private int size;

    public LinkedCollection() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        Elem h = head;
        while (h != null){
            if(h.equals(o)){
                return true;
            }
            h = h.getNext();
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedCollectionIterator<T>(size, head);
    }

    @Override
    public Object[] toArray() {
        Object[] o = new Object[size];
        Elem h = head;
        for (int i = 0; i < size; i++) {
            o[i] = h.getValue();
            h = h.getNext();
        }
        return o;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Elem h = head;
        for (int i = 0; i < size; i++){
            a[i] = (T)h.getValue();
        }
        return a;
    }

    @Override
    public boolean add(T a) {
        Elem p = new Elem(a, head);
        head = p;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Elem h = head;
        while (h.getNext() != null){
            if (h.getValue().equals(o)){
                head = head.deleteK((T)o);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

}
