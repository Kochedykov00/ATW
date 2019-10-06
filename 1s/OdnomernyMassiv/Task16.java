/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 16
 */

public class Task16 {
	public static void main (String [] args) {
		int [] a = {2,3,0,1};
		int [] b = {1,0,2,3};
		int [] c = new int [a.length];
		
		if (a.length == b.length) {		
	for (int i = 0; i < a.length;i++) {
		for (int j = 0; j < a.length;j++) {
			if (a[i] == j) {
				c[i] = b[j];
			}
		}
	}
		}
	
	for (int i = 0; i < c.length;i++) {
		System.out.print(i);
		}
	System.out.println();
	
	for (int i = 0; i < c.length;i++) {
		System.out.print(c[i]);
		}
	
	}
}
	
