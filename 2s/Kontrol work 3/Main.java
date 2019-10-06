import java.util.Scanner;

public class ControlWork3 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        double firstType = 0.5;
        double secondType = 1/3;

        int countOfTables = sc.nextInt();
        int countOfchars = sc.nextInt();
        double countOfway = 0;


        while (countOfchars > 0) {
            chars += secondType;
            countOfchars -=1;
        }

        while (countOfTables > 0) {
            tables +=firstType;
            countOfTables -=1;
        }

        if ((tables % 1 == 0 && (chars % 1 == 0)) || (tables % 1 == 0.5 && (chars % 1 == 0 || chars % 1 == 1/3) {
			int result = (int) tables + chars;
		System.out.println(result);
		else {
			int result = (int) tables + chars;
			System.out.println(result);
		}

}
	}
}
