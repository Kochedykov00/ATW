import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weight = new int[n];
        int 100kg = 0;
        int 50kg = 0;
		
		
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
		
        for (int i = 0; i < n; i++) {
            if (weight[i] == 50) {
                50kg++;
            }
            else 100kg++;
        }
		
		if (100kg >= 50kg) {
			System.out.println(100kg);
		}
		else if ((50kg - 100kg)*50 % 150 == 0){
			System.out.println(100kg + (50kg - 100kg)*50 / 150 );
		}
		else 
			System.out.println((100kg + (50kg - 100kg)*50 / 150) + 1);
        
         }
}
