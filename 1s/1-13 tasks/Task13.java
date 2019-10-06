/**
* @author Kochedykov Alexander
* 11-801
* Task 13
*/
import java.util.Scanner;
	public class Task13{
		public static void main(String[] args) {
        	System.out.print("amount of elements : ");
        	Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	int[] a = new int[n];
        	for (int i = 0; i < n ; i++) {
            	a[i] = sc.nextInt();
            }
            int count = 0;
        	for (int i = 1; i < n-1; i++)
        		if ((a[i] > a[i-1]) & (a[i+1] < a[i]) & (a[i] % 2 == 0)){
        		  count +=1;
        		} 
            boolean flag = false;
        	   if (count == 2){
        	       flag = true;
        	   }
            System.out.println(flag);
        }
    }