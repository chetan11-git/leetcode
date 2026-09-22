class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        int m = n - 1;
        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            sum += mat[i][m];
            m--;
        }
        if(n%2 == 1){
            sum -= mat[(n-1)/2][(n-1)/2];
        }
        return sum;
    }
}
