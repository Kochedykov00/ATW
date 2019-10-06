public class Sort {
	
	public static void compare(String [] s) {
		
		for(int i = s.length - 2 ; i > 0 ; i--){
			for (int j = i+1; j < s.length; j++){
				if (s[j].length() > s[j+1].length()) {
					check : for (int k = 0; k <= s[j+1].length(); i++) {
						if (s[j].charAt(k) > s[j+1].charAt(k)) {
							String s3 = s[j];
							s[j] = s[j+1];
							s[j+1] = s3;
							break check;
						}
							}
				}
			else {
			
				check1 : for (int k = 0; k < s[j].length(); i++) {
					if (s[j].charAt(k) > s[j+1].charAt(k)) {
						String s3 = s[j];
						s[j] = s[j+1];
						s[j+1] = s3;
						break check1;
					}
				}
			}
				}
		}
			
		
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
		
			
		}
		
	}
	
		
		