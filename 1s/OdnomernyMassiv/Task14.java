/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 14
 */
 
import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        input[0] = 1;
        int k = -1;
        for (int i = 1; i < input.length; i++) {
            input[i] = (Math.abs(input[i - 1]) + 2) * k;
            k *=-1;
        }
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}