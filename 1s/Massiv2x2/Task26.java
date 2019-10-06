/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 26
 */
 
 public class Task26 {
	public static void main (String [] args) {
	
		int [][][] array3d = {{ {1,-2,3} , {8,3,3} }, { {-3,-9,6,9},{1},{2,3}}} ;
		boolean flag = false;
		int k = 0;
		
		for (int i = 0; i < array3d.length; i++) {
			for (int j = 0; j < array3d[i].length; j++) {
				for (int f = 0; f < array3d[i][j].length; f++) {
					if ((array3d [i][j][f] % 3) == 0) {
						k ++;
					}
				}
				if (array3d[i][j].length == k) {
					flag = true;
				}
				k = 0 ;
				
				}
			}
		
		System.out.println(flag);
	}
}
					
				
		
		
		