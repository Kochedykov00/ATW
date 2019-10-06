/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 32
 */
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task32 {
	
	public static void main (String [] args) {
		
		String s = "Hello,mom mom";
		char[] chars = s.toCharArray();
			for (int i = 0;i < chars.length - 2;i++) {
					if ((chars[i] == 'm') & (chars[i+1] == 'o') & (chars[i+2] == 'm')) {
						chars[i] = 'd';
						chars[i+1] = 'a';
						chars[i+2] = 'd';
					}
			}
						
		String s1 = new String(chars);	
		System.out.print(s1);
	}
}
						