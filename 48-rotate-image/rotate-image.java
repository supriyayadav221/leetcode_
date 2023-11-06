class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length - 1;
        int n = matrix[0].length;
        int res[][] = new int[m+1][n];
            int kk = 0;

        for(int i = m ; i >=0 ; i = i -1){

            for(int j = 0; j < n ; j++ ){
                res[j][kk]=matrix[i][j];
            }
            
            kk++; 

        } 
        for(int i = 0; i<= m; i++ ){
            for(int j = 0; j < n ; j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}