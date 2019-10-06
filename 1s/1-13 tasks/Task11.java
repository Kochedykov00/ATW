/**
* @author Kochedykov Alexander
* 11-801
* Task 11
*/
import java.util.Scanner;
	public class Task11{
		public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	int k = sc.nextInt();
        	int power = 1;
        	int result = 0;
        	while (n !=0){
        		result += (n % 10) * power;
        		power *= k ;
        		n = n /10;
            }
        	System.out.println(result);
        }
    }