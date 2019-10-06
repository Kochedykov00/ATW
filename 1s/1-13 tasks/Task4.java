import java.util.Scanner;
public class Task4{
	public static void main(String[]args){
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int secLine = (n - 1)/2;
	 int thrLine = (n - 1)/4;
	 int k = n + 1 - secLine - thrLine;

	 firstLine(n);
	 secondLine(n,secLine);
	 thirdLine(n,secLine,thrLine);
	 for (int i = 1; i < k-3;i++){
	 	nextLinePrint(n,secLine,thrLine,i);
	 }
	 if (n > 5) {
	 	for (int i = 0; i < thrLine ;i++){
	 		System.out.print("**");
	 		for (int j = 0; j < 2 * n - 3;j++){
	 			System.out.print('0');
	 			}
	 			System.out.print("**");
	 			System.out.print('\n');

        }

	 }
	 for (int i = 0; i < secLine; i++){
	 	System.out.print('*');
	 	for (int j = 0; j< 2 * n - 1;j++){
	 		System.out.print('0');
	 	}
	 	System.out.print('*');
	 	System.out.print('\n');
        }
    for (int i = 0 ; i < 2 * n + 1;i++){
    	System.out.print('0');
    	}
    System.out.print('\n');
    for ( int i = 0;i < secLine; i++){
    	System.out.print('*');
    	for (int j = 0;j < 2 * n - 1;j++){
    		System.out.print('0');}
    		System.out.print('*');
    		System.out.print('\n');
    	}
    if (n>5) {
    	for (int i = 0;i < thrLine; i++){
    		System.out.print("**");
    		for (int j = 0;j < 2 * n - 3;j++){
    			System.out.print('0');
    			}
    			System.out.print("**");
    			System.out.print('\n');

    	}
    }
    for (int i = k - 4; i > 0; i--){
    	nextLinePrint(n,secLine,thrLine,i);
    }
    thirdLine(n,secLine,thrLine);
    secondLine(n, secLine);
    firstLine(n);
    }

    private static void firstLine(int n){
    	for (int i = 0; i < n;i++){
    		System.out.print('*');
    	}
    	System.out.print('0');
    	for (int i = 0;i < n;i++){
    		System.out.print('*');
    	}
    	System.out.print('\n');
    }
    private static void secondLine(int n, int secLine){
    	for (int j = 0;j < (n-secLine);j++){
    		System.out.print('*');
    	}
    		for (int j = 0; j < secLine * 2 + 1;j++ ){
 				System.out.print('0');
 			}
 			for (int j = 0;j < (n-secLine);j++){
 				System.out.print('*');
 			}
 			System.out.print('\n');
    } 
    private static void thirdLine(int n, int secLine,int thrLine){
    	for (int j = 0;j < (n-secLine-thrLine);j++){
    		System.out.print('*');
    	}
    		for (int j = 0; j < secLine * 2 + thrLine * 2 + 1;j++ ){
 				System.out.print('0');
 			}
 			for (int j = 0;j < (n-secLine-thrLine);j++){
 				System.out.print('*');
 			}
 			System.out.print('\n');
 			}
 	private static void nextLinePrint(int n, int secLine,int thrLine,int count){
    	for (int j = 0;j < (n-secLine-thrLine-count);j++){
    		System.out.print('*');
    	}
    		for (int j = 0; j < secLine * 2 + thrLine * 2 + 1+count*2;j++ ){
 				System.out.print('0');
 			}
 			for (int j = 0;j < (n-secLine-thrLine-count);j++){
 				System.out.print('*');
 			}
 			System.out.print('\n');
 			}






    
    





    }
    