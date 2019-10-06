import java.util.Collection;
import java.util.Iterator;

public class ArrayCollection<T> extends AbstractCollection<T> implements Collection<T> {

    private T[] arr;
    private int size;

    @Override
    public int size() {
        return size;
    }


    @Override
    public Iterator<T> iterator() {
        return new ArrayCollectionAndListIterator<>(size, arr);
    }

    @Override
    public Object[] toArray() {
        Object[] o = new Object[size];
        for (int i = 0; i < size; i++) {
            o[i] = arr[i];
        }
        return o;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        for (int i = 0; i < size; i++){
            a[i] = (T)arr[i];
        }
        return a;
    }
	
	@Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean add(T a) {
        arr[size] = a;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++){
            if(arr[i].equals(o)){
                for(int j = i; j < size; j++){
                    arr[j] = arr[i + 1];
                }
                arr[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
	
	public ArrayCollection() {
        this.arr = (T[])new Object[10];
        this.size = 0;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<?> iter1 = c.iterator();
        Iterator<?> iter2 = this.iterator();
        boolean flag = false;
        while (iter1.hasNext()){
            while(iter2.hasNext() && !(iter1.next().equals(iter2.next()))){
                if(iter1.next().equals(iter2.next())){
                    flag = true;
                }
                iter2.next();
            }
            if(!flag){
                return false;
            }
            iter1.next();
        }
        return true;
    }

    
}
