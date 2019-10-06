/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 37
 */
 
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task37 {

	public static void main (String [] args) {
		Pattern pattern = Pattern.compile("^[0|2|4|6|8]{3,6}[1|3|5|7|9]{0}$");
		int count = 0;
		Integer n = 0;
		int k = 0;
		Random random = new Random();
			while (count < 10) {
				k += 1;
				n = 1 + (int) (Math.random()* 32000);
				Matcher matcher = pattern.matcher(n.toString());
					if (matcher.find()) {
						System.out.println(n);
						count++;
					}
			}
		System.out.println(k);
	}
					
}