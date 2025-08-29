class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] a = new int[nums.length];
        int[]b=new int[nums.length];
        int acnt =0,bcnt=0;
        //brute force
        for(int i=0;i<nums.length;i++){
            if(nums[i]>= 0) a[acnt++]=nums[i];
            else b[bcnt++]=nums[i];
        }
        int j=0;int i=0;
        while(i<acnt && i<bcnt ) {
            nums[j++]=a[i]; 
            nums[j++] = b[i]; i++;
    }return nums;
}}