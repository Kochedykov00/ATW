import java.util.Scanner;

public class Task44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countOfOperations = 0;
        String s = null;
		int operations = 0;
		
		while (n != 1) {
			
			while (n % 2 == 0) {
				operations++;
				n = n/2;
				s = s.concat("1");
			}
			
			while (n % 3 == 0) {
				operations++;
				n = n/3;
				s = s.concat("2");
			}
			while ((n % 3 != 0) && (n % 2 != 0) && n != 1) {
				operations++;
				n--;
				s = s.concat("3");
			}
		}
		
		char [] step = s.toCharArray();
		String final = null;
		
		for (int i = step.length - 1; i >= 0; i--) {
			final = final.concat(step[i])
		
		}
	}
}
