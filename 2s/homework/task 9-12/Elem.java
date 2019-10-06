package Interface_1;

public class Elem <T> {
    T value;
    Elem <T> next;

    public Elem(T o, Elem <> e ) {
        this.value = o;
        this.next = e;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Elem getNext() {
        return next;
    }

    public void setNext(Elem<T> next) {
        this.next = next;
    }

    public static T max(Elem<T> head) {
        T max = head.value;
        Elem <T> p = head.next;
        while (p != null) {
            if (max < p.value) {
                max = p.value;
            }
            p = p.next;
        }
        return max;
    }

    public static boolean hask(Elem <T> head, int k) {
        Elem <T> p = head;
        while (p != null) {
            if (p.value == k) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    public static Elem <T> deletePreLast(Elem <T> h) {
        Elem <T> q = h;
        if (q.next.next == null) {
            return null;
        }
        while (q.next.next.next != null) {
            q = q.next;
        }
        q.next = null;
        return h;
    }
	
	public static Elem <T> deleteLast(Elem <T> h) {
        Elem q = h;
        if (q.next == null) {
            return null;
        }
        while (q.next.next != null) {
            q = q.next;
        }
        q.next = null;
        return h;
    }

    public static Elem <T> setK(Elem <T> head, int k, int m) {
        Elem <T> p = head;
        Elem <T> q = new Elem <T>();
        if (p.value == k) {
            q.value = m;
            q.next = p.next;
            p.next = q;
        }
        return head;
    }




