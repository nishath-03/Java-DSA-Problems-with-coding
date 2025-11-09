class Solution {
    public int countOperations(int num1, int num2) {

        int cnt =0;
        if(num1==0 && num2 ==0) return 0;
         if(num1==0 || num2 ==0) return 0;
        while(num1>num2 || num1<num2){
            //   if(num1==0|| num2==0) {
            //     if(num1 == 0)cnt = (num2-1);
            //     if(num2 == 0)cnt = (num1-1);
            //     return cnt;
            //     }
              if(num1>=num2){
                  num1 = Math.abs(num1-num2);
                  cnt++;
              }
              else{
                  num2 = Math.abs(num2-num1);
                  cnt++;
              }
        }return cnt+1;
    }
}