import java.util.*;

public class q2376 {
    public int countSpecialNumbers(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        
        int res = 0;
        // the total number with numbers with len < n
        for(int i = 1; i < len; i++) {
            res += countNoRepeat(i);
        }
        
        // the total number with numbers with len = n
        Set<Integer> set = new HashSet<>();
        int i = 0;
        for(i = 0; i < len; i++) {
            int d = s.charAt(i) - '0';
            int pivot = choosePivot(set, d, i == 0);
            for (int j = i + 1; j < len; j++) {
                pivot *= (10 - j);
            }
            res += pivot;
            if(!set.add(d)) {
                break;
            }
        }
        // the number n itself
        if(i == len) {
            res++;
        }
        return res;
        
    }
    
    // return the total number of d digit number which has no repeated digits
    public int countNoRepeat(int d) {
        int res = 9;
        for(int i = 1; i < d; i++) {
            res*= (10 - i);
        }
        return res;
    }
    
    public int choosePivot(Set<Integer> set, int d, boolean flag) {
        int res = 0;
        int i = (flag ? 1 : 0);
        while(i < d) {
            if(!set.contains(i++)) {
                res++;
            }
        }
        
        return res;
    }
    
}
