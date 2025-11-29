class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length<=1) return nums[0];
        //INITIALIZING
        double wsum=0,max=Integer.MIN_VALUE;
        int wstart=0;
        //TRAVERSING WITH WINDOW CONCEPT
        for(int wend=0 ; wend<nums.length ; wend++){
            wsum+=nums[wend];
            if(wend-wstart+1 == k){
                //CALC AVG
                max = Math.max(max , wsum/k);
                wsum-=nums[wstart];

                wstart++;
            }
              //RETURN
        }return max;
        
      
    }
}