/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 36
 */
 
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task36 {

	public static void main (String [] args) {
		Pattern pattern = Pattern.compile("0|2|4|6|8{3,}");
		int count = 0;
		Integer n = 0;		
		Random random = new Random();
			while (count < 10) {
				n = 1 + (int) (Math.random()* 32000);
				Matcher matcher = pattern.matcher(n.toString());
					if (matcher.find()) {
						n = 0;
					}
					else {
						count ++;
						System.out.println(n);
					}
			}
	}
					
}
	

				
			
			
