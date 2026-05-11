class Solution {
    static String numsInStr(int[] nums){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
        }
        return sb.toString();
    }
    public int[] separateDigits(int[] nums) {
        String str= numsInStr(nums);
        int[] ans=new int[str.length()];
        for(int i=0; i<str.length(); i++){
            ans[i]= str.charAt(i) -'0';
        }
        return ans;
    }
}