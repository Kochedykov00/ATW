public class Elem {
    int value;
    int number;
    Elem next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Elem getNext() {
        return next;
    }

    public void setNext(Elem next) {
        this.next = next;
    }
	
	public void printElem(Elem head) {
		Elem p = head;
		while (p != null) {
			System.out.println(p.value);
			p = p.next;
		}
	}
		

    public int max (Elem head) {
		int max = head.value;
		Elem p = head;
		while (p.next != null) {
			if (p.value > max) {
				max = p.value;
			}
			p = p.next;
		}
		return max;
	}
	
	public boolean checkOnMinusElement(Elem head) {
		Elem p = head;
		boolean check = false;
		while (p != null) 
		if (p.value < 0) {
			check = true;
			p = p.next;
		}
	}
	
	public int sum (Elem head) {
		int sum = head.value;
		Elem p = head;
		while (p.next != null) {
			sum += p.value;
			}
			p = p.next;
		}
		return sum;
	}
	
	
	public static Elem deleteLast(Elem h) {
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
	
	
	public void input() {
		Elem p = new Elem();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			int n = sc.nextInt();
			p.value = n;
			p.next = null;
		}
	}

    public static Elem deletePreLast(Elem h) {
        Elem q = h;
        if (q.next.next == null) {
            return null;
        }
        while (q.next.next.next != null) {
            q = q.next;
        }
        q.next = null;
        return h;
    }

    public static Elem setK(Elem head, int k, int m) {
        Elem p = head;
        Elem q = new Elem();
            if (p.value == k) {
        q.value = m;
        q.next = p.next;
        p.next = q;
    }
            return head;
}


	public static Elem deleteHead(Elem head) {
		Elem q = head;
		q = null;
		return q;
	}
}





