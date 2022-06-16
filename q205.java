
import java.util.HashMap;
public class q205 {
    
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> ht = new HashMap<>();
        HashMap<Character, Integer> ht2 = new HashMap<>();
        for(Integer i = 0; i < s.length(); i++) {

            if(ht.put(s.charAt(i), i) != ht2.put(t.charAt(i), i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
