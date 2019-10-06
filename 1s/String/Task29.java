/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 29
 */
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task29 {
	public static void main (String [] args) {
		int count = 0;
		String s = "Hello World rEg";
		String [] s1 = s.split(" ");
		Pattern pattern = Pattern.compile("(^[A-Z].)(.*)");
			for (int i = 0; i < s1.length ; i++) {
				Matcher matcher = pattern.matcher(s1[i]);
					if (matcher.find()) {
						count++;
					}
			}
		System.out.println(count);
	}
}