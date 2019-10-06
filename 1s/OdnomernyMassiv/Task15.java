/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 15
 */
 
 import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        int result = 0;
        int result1 = 0;
        int k = 1;
            for (int i = 0; i < input.length; i++) {
                input[i] = sc.nextInt();
            }
            for (int i = input.length - 1 ; i >= 0; i--) {
                result = result + input[i] * k;
                k *= 10;
            }
        System.out.println(result);
        k = 1;
            for (int i = 0; i < input.length ; i++) {
                result1 = result1 + input[i] * k;
                k *= 10;
            }
        System.out.println(result1);
    }
}
