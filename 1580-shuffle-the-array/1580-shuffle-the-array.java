class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []cpy = nums.clone();
         int temp=0;
        for(int i=0;i<n;i++){
           nums[2*i]=cpy[i];
           nums[2*i+1]=cpy[(n)+i];


        }return nums;

    }
}