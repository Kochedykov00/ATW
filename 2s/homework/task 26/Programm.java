import java.util.TreeMap;
import java.util.*;

public class Programm {

    public static TreeMap <Character, Integer> readChar (String s) {
        TreeMap <Character, Integer> chars = new TreeMap<Character, Integer>();
        String s1 = s.toLowerCase();
		String s2 = "abcdefghijklmnopqrstuvwxyz";
        int k = 0;
        for (int i = (int) s2.charAt(0) ; i < s.length() + s2.charAt(0) ; i++) {
            if (chars.containsKey(s1.charAt(k))) {
                chars.put(s1.charAt(k) ,  chars.setValue(chars.getValue() + 1));
            k++;
        }
        return chars;

    }
}
