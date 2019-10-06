public class Task42 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    int countOfMans = sc.nextInt;
	int countOfWomans = sc.nextInt;
    public static String people [] = new String[n];
	
	if (countOfMans>= countOfWomans) {
        for (int i = 0; i < countOfWomans; i++) {
            people[i] = "Female";
        }
		
        for (int j = countOfWomans; j < countOfMans; j++) {
           people[j] = "Man";
        }
	}
	
	else {
		for (int i = 0; i < countOfMans; i++) {
            people[i] = "Man";
        }
        for (int j = countOfMans; j < countOfWomans; j++) {
           people[j] = "Female";
        }
	}
}
		
        String s = "";
        backTracking(s);
        System.out.println(result);
    


    public static void backTracking(String s) {
        if (s != null && s.length() == countOfMans) {
            result = s;
        } else {
            for (int i = 0; i < people.length; i++) {
                if (!people[i].equals("")) {
                    String s1 = people[i];
                    s += s1;
                    if (check(s)) {
                        people[i] = "";
                        backTracking(s);
						people[i] = s1;
                    }
                    s = removeCharAt(s, s.length() - 1);
                }

            }
        }
    }

    public static String removeCharAt(String s, int position) {
        return s.substring(0, position) + s.substring(position + 1);
    }

    public static boolean check(String s) {
        if (s.charAt(0) == 'F' || ( s.length() == countOfMans && s.charAt(s.length() - 1) == 'F')){
            return false;
        }
		
		
        for (int j = 0; j < s.length() - 2; j++) {
            if (s.charAt(j) == 'M' && s.charAt(j + 1) == 'M' && s.charAt(j + 2) == 'M') {
                return false;
            }
        }
        return true;
    }
}
