import java.util.Scanner;
public class Task1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count;
	    count = 0;
		for (int i = 1; i <= 2*n+1; i++){
			count++;

			for (int j = 1; j <= 2*n-i+1; j++){
				System.out.print(" ");
			}
			if (i==(n+1)){
				count=0;
			}
			
			for (int j = 1; j <= 2*count-1; j++){
				if (i==n+1) break;
				System.out.print("*");

			}
			if (i>(n+1)) {
				for (int j = 1; j <= (4*n-2*i+5);j++){
					System.out.print(" ");
				}
				for(int j = 1;j <= (2*count-1);j++){
					System.out.print("*");
				}

			}

			
			System.out.println();
		}
		}
	}
