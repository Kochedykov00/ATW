package Interface_1;

import java.util.Collection;
import java.util.Iterator;

public abstract class AbstractCollection<T> implements Collection<T> {

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        Iterator<T> iter = this.iterator();
        while (iter.hasNext()){
            this.remove(iter.next());
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        Iterator<T> iter = this.iterator();
        while (iter.hasNext()){
            if(!(c.contains(iter.next()))){
                this.remove(iter.next());
            }
            iter.next();
        }
        return true;
    }
	
	
    @Override
    public boolean addAll(Collection<? extends T> c) {
        Iterator<?> iter = c.iterator();
        while (iter.hasNext()){
            this.add((T)iter.next());
        }
        return true;
    }
	
	@Override
    public boolean removeAll(Collection<?> c) {
        Iterator<?> iter = c.iterator();
        while (iter.hasNext()){
            if(this.contains(iter.next())){
                this.remove(iter.next());
            }
            iter.next();
        }
        return true;
    }

}
