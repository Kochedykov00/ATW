/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 31
 */
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task31 {
	
	public static void main (String [] args) {
		int count = 0;
		
		String s = "Hello,true true";
		char[] chars = s.toCharArray();
		int k = chars.length + 1;
		char[] chars1 = new char[k];
			for (int i = 0;i < chars.length - 3;i++) {
					if ((chars[i] == 't') & (chars[i+1] == 'r') & (chars[i+2] == 'u') & (chars[i+3] == 'e')) {
						count++;
						chars1[i] = chars[i];
						if (count == 2) {
						chars1[i] = 'f';
						chars1[i+1] = 'a';
						chars1[i+2] = 'l';
						chars1[i+3] = 's';
						chars1[i+4] = 'e';
						count = 0;
						}
						
		
			}
			 else {
				chars1[i] = chars[i];
					}
			}
		String s1 = new String(chars1);	
		System.out.print(s1);
	
}
}