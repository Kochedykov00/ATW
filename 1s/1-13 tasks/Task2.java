/**
*@author Alexandr Kochedykov
*11-801
*Task 02
*/
 
import java.util.Scanner;
	public class Task2 {
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int i;
		if (c1>=c2){
		for(i=c2;c2<c1;i++){
			if (i % 3 == 0 )
			System.out.println(i);
			}
		}
		if (c2>c1) {
		for(i = c1;i<c2;i++){
			if (i % 3 == 0){
			System.out.println(i);
			}
		}

		}
		
		} 
		}