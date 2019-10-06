import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        String s = "abracadabra";
        TreeMap <Character, Integer> states  = Programm.readChar(s);


        for (Map.Entry<Character, Integer> item : states.entrySet()){


            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }


    }
}
