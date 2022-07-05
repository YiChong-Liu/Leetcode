public class q370 {

    public int[] getModifiedArray(int length, int[][] updates) {
        int []res = new int[length];
        for(int i = 0; i < length; i++) {
            res[i] = 0;
        }
        for(int i = 0; i < updates.length; i++) {
            int start = updates[i][0];
            int end = updates[i][1];
            int inc = updates[i][2];
            for(int j = start; j <= end; j++) {
                res[j] += inc;
            }
        } 
        return res;
    }

    public static void main(String[] args) {
        q370 sol = new q370();
        int length = 5;
        int [][]updates = {{1,3,2}, {2,4,3}, {0,2,-2}};
        int []res = sol.getModifiedArray(length, updates);
        for(int sub : res) {
            System.out.print(sub + " ");
        }
        System.out.println();
    }
}
