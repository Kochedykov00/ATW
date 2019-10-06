public class Main {

    public static void main(String[] args) {

        Stack <Character> stack = new Stack<>();
        String s = "{(())}";



        try {
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) == '{') | (s.charAt(i) == '[') | (s.charAt(i) == '(')) {
                    stack.push(s.charAt(i));
                }
                else if ((s.charAt(i) == '}' && stack.pop() == '{') | (s.charAt(i) == ']' && stack.pop() == '[') | (s.charAt(i) == ')' && stack.pop() == '(')){
                    System.out.println("Gooooood");
                }
                else if ((s.charAt(i) == '}' && stack.pop() != '{') | (s.charAt(i) == ']' && stack.pop() != '[') | (s.charAt(i) == ')' && stack.pop() != '(')){
                    System.out.println("So bad");
                }
            }
        }
        catch (EmptyStackException e) {
            System.out.println("Стэк пуск.Баланс скобок не соблюдается");
        }

        }
 }