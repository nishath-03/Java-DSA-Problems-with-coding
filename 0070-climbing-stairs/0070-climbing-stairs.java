class Solution {
    public int climbStairs(int n) {
        
        int curr =0,prev1=1,prev2=2;
        int temp=0;
      int i=0;
         while(i!=n){
            //curr = Math.max(curr,prev1+prev2);
            curr = prev1+prev2;temp=prev1;
             
            prev1=prev2;
            prev2=curr;
            i++;
         }return temp;
    }
}