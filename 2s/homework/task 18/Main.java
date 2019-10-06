import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int k = i;

            while ((k % 2 == 0)|(k % 3 == 0)|(k % 5 == 0)|(k == 1)) {

                if (k % 2 == 0) {
                    k = k/2;
                }
                if (k % 3 == 0) {
                    k = k/3;
                }
                if (k % 5 == 0) {
                    k = k/5;
                }
                if (k == 1) {
                    System.out.println(i);
                    break;
                }
            }
        }



        }
}