class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int l = matrix[0].length;
        int temp=0;
        for(int i=0 ; i<r;i++){
            for(int j=i+1 ; j<r;j++){
                if(i!=j){
                  temp = matrix[i][j];
                  matrix[i][j] = matrix[j][i];
                  matrix[j][i]= temp;
                }
            }
        }
        //reverse the rows
        for(int i=0 ; i<r ; i++){
               int left =0; int right =r-1;
               while(left<right){
                temp = matrix[i][left];
                matrix[i][left] =   matrix[i][right];
                matrix[i][right] =  temp;
                left++;
                right--;
               }          
            
        }
    }
}