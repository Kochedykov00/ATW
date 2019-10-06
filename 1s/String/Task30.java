/**
 * @author Kochedykov Alexander
 * 11-801
 * Task 30
 */
 
 public class Task30 {
	public static void main (String [] args) {
		
		String s = "Hello world";
		char [] s1 = s.toCharArray();
		int [] language = new int[26];
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n','o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x','y', 'z' };
		
			for ( int i = 0; i < s1.length; i++ ){
				for( int j=0; j < alphabet.length; j++ ){
					if( s1[i] == alphabet[j] ){
                            language[j]++;
                    }
     
                }
                     
			}
		for ( int i = 0; i < alphabet.length; i++){
			System.out.println( "The char " + alphabet[i] + " appears " + language[i] + " time ");
     }	
	}
	
}

	
	