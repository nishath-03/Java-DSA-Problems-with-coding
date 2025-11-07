class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> res = new ArrayList<>();
        int r= matrix.length;
        int l= matrix[0].length;

         int top =0,left=0;
        int bottom=r-1; 
        int right = l-1;

    
       while(top<=bottom && left<=right){
       // go left to right and top++
       for(int i=left ; i<=right; i++){
        
          res.add( matrix[top][i]);
       }top++;

       //go top to bottom & right--
       for(int i=top ; i<=bottom; i++){
        
          res.add( matrix[i][right]);
       }right--;

       if (top <= bottom) {
                
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }

       }return res;

    }
}