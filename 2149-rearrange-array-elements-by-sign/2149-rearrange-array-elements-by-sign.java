class Solution {
    public int[] rearrangeArray(int[] nums) {
        //brute force
        int[] a = new int[nums.length];
        int[] b = new int[nums.length];
        int acnt=0,bcnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0) a[acnt++] = nums[i];
            else b[bcnt++] = nums[i];
        }
        int i = 0, k = 0;
        while(i < acnt && i < bcnt){
            nums[k++] = a[i];
            nums[k++] = b[i];
            i++;
        }

        while(i < acnt) nums[k++] = a[i++];
        while(i < bcnt) nums[k++] = b[i++];

        return nums;
    }
}
