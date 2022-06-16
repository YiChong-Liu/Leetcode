import java.util.Arrays;
public class q1502 {
    
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 2; i++) {
            if((arr[i + 1] - arr[i]) != (arr[i + 2] - arr[i + 1])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        q1502 sol = new q1502();
        int []arr = {3, 5, 1};
        System.out.println(sol.canMakeArithmeticProgression(arr));
    }
}
