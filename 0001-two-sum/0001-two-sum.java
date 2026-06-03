class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start =0;
        int end =0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    start = i;
                    end = j;
                }
            }
        }
        int []res={start,end};
        return res;
    }
}