/**
* @author Kochedykov Alexander
* 11-801
* Task 10
*/
import java.util.Scanner;
	public class Task10{
		public static void main(String[] args) {
        	System.out.print("amount of elements : ");
        	Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	int[] a = new int[n];
        	for (int i = 0; i < n ; i++) {
            	a[i] = sc.nextInt();
            }   
            int count = 0;
            int l1 = 0;
            int l2 = 0;
            for (int i = 0; i < n;i++){
                while (a[i] !=0){
                    if ((a[i] % 10) < ((a[i] / 10) % 10) | (a[i] / 10 == 0)) {
                        l1 +=1;
                    }
                        l2 +=1;
                        a[i] = a[i] / 10;
                    }
                if (l2==l1){
                    count +=1;
                }
            }
            boolean flag = false;
                if (count ==3){
                    flag = true;
                }
            System.out.println(flag);
        }
    }