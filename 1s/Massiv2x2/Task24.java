/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 24
 */
 
 public class Task24 {
	public static void main (String [] args) {
		int n = 3;
		int [][] array = { {1,2,3} , {1,2,3} , {0,7,2} } ;
		int max = Integer.MIN_VALUE;
		int k = 0;
		
		for (int i = 0; i < n; i++ ) {
			int sum = 0;
			for (int j = 0 ; j < n;j ++){
				sum += array [j] [(j+i) % n];
			}
				if (max < sum){
					max = sum;
				}	
				k++;
		}
		System.out.println(max);
	}
}
				
			
		
		