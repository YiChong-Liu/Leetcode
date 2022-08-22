
import java.util.Arrays;
public class q2358 {
    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int len = grades.length;
        int n = 1;
        int res = 0;
        while(len > 0) {
            len -= n;
            res++;
            n++;
            if(n > len) {
                break;
            }
        }
        return res;
    }
}
