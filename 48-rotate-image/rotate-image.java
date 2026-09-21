class Solution {
    public void swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void reverse(int matrix[][], int row, int j, int m){
        while(j<m){
            int temp = matrix[row][j];
            matrix[row][j] = matrix[row][m];
            matrix[row][m] = temp;

            j++;
            m--;
        }
    }
    public void rotate(int[][] matrix) {
        //transpose

        int n =matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                swap(matrix,i,j);
            }
        }

        for(int i=0;i<n;i++){
            reverse(matrix,i,0,m-1);
        }
    }
}