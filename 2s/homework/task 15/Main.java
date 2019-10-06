public class Main {

    public static void main(String[] args) {

        String s = new String("(hfdjskjsh)()");
        int count = 0;
        for (int i = 0; i < s.length();i++) {
            if (s.charAt(i) == '(') {
                count +=1;
            }
            if (s.charAt(i) == ')') {
                count -=1;
            }
        }
        if (count < 0) {
            System.out.println(" ')' more then '(' ");
        }
        else if (count > 0) {
            System.out.println(" '(' more then ')'");
        }
        else {
            System.out.println(" ')' and '(' are equals");
        }

        }
 }