/**
* @author Kochedykov Alexander
* 11-801
* Task 09
*/
import java.util.Scanner;
	public class Task9{
		public static void main(String[] args) {
        	System.out.print("amount of elements : ");
        	Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	int[] a = new int[n];
        	for (int i = 0; i < n ; i++) {
            	a[i] = sc.nextInt();
        		}
        	int count = 0;
        	int chet;
        	int nechet;
        	int local = 0;
        	boolean flag = false;
    		for (int i = 0; i < n ; i++){
    			chet = 0;
    			nechet = 0;
    		if ((a[i] / 100 != 0) & (a[i] % 1000 == a[i])){
    			local = a[i];
    		while (local !=0){
    			if ((local % 10) % 2 == 0)
    				chet +=1 ;
    			else nechet +=1;
				local = local / 10;	
    		}
    				
				
			if ((chet == 3)||(nechet == 3)){
				count +=1;
			}
			}
			if ((a[i] / 10000 != 0) & (a[i] % 100000 == a[i])){
    			local = a[i];
    		while (local !=0){
    			if ((local % 10) % 2 == 0)
    				chet +=1;
    				else nechet +=1;
    				local = local / 10;
			}
    				
    		if ((chet == 5)||(nechet == 5)){
				count +=1;
			
			}
			}
			}
			if (count == 2){
     			flag = true;
     		}
    		System.out.println(flag);
	}
    }



