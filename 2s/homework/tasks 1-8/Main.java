import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int n = sc.nextInt();

        Elem head = null;
        Elem p = null;

        int max = 0;
        for (int i = 0; i < n; i++) {
            p = new Elem();
            p.value = sc.nextInt();
            p.next = head;
            head = p;

        }
        p = head;
        while (p != null) {
           System.out.println(p.value) ;
            p = p.next;
        }
	}
}
     