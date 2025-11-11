class Solution {
    public int fib(int n) {
        // int [] dp = new int [n];

        // int dp[0]=0;
        // int dp[1]=1;
        int curr =0,prev1=0,prev2=1;
      int i=0;
         while(i==n){
            curr = prev1+prev2;
            prev2=prev1;
            prev1=curr;
            i++;
         }return curr;
    }
}