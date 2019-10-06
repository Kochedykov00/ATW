/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 22
 */
 
 public class Task22 {
	
	public static void main(String[] args) {

		int [][] array = { {5,5,5,4,6,6,7} , {5,5,4,7,7,2,1} , {5,5,5,4,6,6,7} , {5,5,5,4,6,6,7} , {4,4,5,4,6,6,7} , {5,6,5,4,6,6,7} , {6,8,5,4,6,6,7}} ;
		
		for (int i = 0; i < (int) ( array.length / 2); i++) {
			for (int k = 1 + i ; k < array.length - 1 - i; k++) {
				array [i][k] = 0;
			}
		}
		
		for (int i = array[0].length - 1 ; i > (int) ( array.length / 2); i--) {
			for (int k = 1 + (array[0].length - 1) - i ; k < i ; k++) {
				array [i][k] = 0;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]);
			}
		}
	}
}
		
		
		