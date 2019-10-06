public class Compare {
	
	public static void compare(String [] s) {
		
		for(int i = s.length-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
            
            if( s[j] > s[j+1] ){
                String tmp = s[j];
                s[j] = s[j+1];
                s[j+1] = tmp;
            }
        }
    }

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
			
		
			
		}
		
	}
	
		
		