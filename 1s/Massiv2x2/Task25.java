/**
* @author Kochedykov
* 11-801
* Task25
*/
import java.util.Scanner;

public class Task25 {
	
	public static void main(String[] args) {

		int [][] a = { {3,6,2} , {5,7,4} } ;
		int [][] b = { {2,4} , {4,7} , {7,1} } ;		
		int n = a.length;
		int a1 = a[0].length;
		int b2 = b[0].length;
		int [][] p = new int [n][a1];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < b2; j++) {
				for (int l = 0; l < a1; l++) {
					p[i][j] += a[i][l]* b[l][j];
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < b2; j++) {
				System.out.print(p[i][j] + " ");
			}
		}
		
	}

}