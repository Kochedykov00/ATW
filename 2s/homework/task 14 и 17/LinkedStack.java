package Stack;


public class LinkedStack <T> implements IStack <T>  {
 
    public Elem <T> head;
	int realSize;
   

    void push(T a) {
        Elem <T> p = new Elem<>(a,head);
		head = p;
		realSize++;
    }

    T peek() {
          if(head != null){
            return head.value;
        }else{
            throw new StackListException("пуст");
        }
    }
    }

    T pop() {
        if(head!=null){
            T h = head.value;
            head = head.next;
            return h;
        }else{
            throw new StackListException("пуст");
        }
    }
    }

    boolean isEmpty() {
        if (head == null ) {
            return true;
        }
        return false;
    }
}
