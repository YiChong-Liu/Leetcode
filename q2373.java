public class q2373 {
    public int[][] largestLocal(int[][] grid) {
        int len = grid.length - 2;
        int [][] res = new int[len][len];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                res[i][j] = findMatrixMax(grid, i, j);
            }
        }
        return res;
    }
    
    // find the maximum number within certain parts of a matrix
    public int findMatrixMax(int [][]m, int starti, int startj) {
        int max = 0;
        for(int i = starti; i <= starti + 2; i++) {
            for(int j = startj; j <= startj + 2; j++) {
                max = Math.max(m[i][j], max);
            }
        }
        return max;
    }
}
