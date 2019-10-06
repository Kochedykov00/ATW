/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 21
 */
 
 public class Task21 {
	public static void main (String [] args) {
		int n = 3;
		int [][] array = { {6,2,4} , {8,2,12} , {0,4,2} } ;
		int max = Integer.MIN_VALUE;
		int k = 0;
		boolean flag = false;
		
		for (int i = 0; i < n; i++ ) {
			int sum = 0;
			for (int j = 0 ;j < n; j++){
				sum += array [n - j - 1] [(j+i) % n];
			}
				if ((sum % 2) == 0){
				k += 1;
				}
		}
				
				if (k == n) {
					flag = true;
				}
		System.out.println(flag);
	}
}