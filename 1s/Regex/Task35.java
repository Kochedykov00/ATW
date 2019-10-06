/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 35
 */
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task35 {
	
	public static void main (String [] args) {
		
		String [] s = {"01010" , "000" , "001" , "010"};
		Pattern pattern = Pattern.compile("(^0+$)|(^1+$)|(^10+(1|10)?$)|(^01+0|01$)");
			for (int i = 0; i < s.length; i++) {
				Matcher matcher = pattern.matcher(s[i]);
					if (matcher.find()) {
						System.out.println(i);
					}
			}
	}
}
