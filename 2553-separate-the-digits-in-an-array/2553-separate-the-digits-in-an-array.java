class Solution {
    public int[] separateDigits(int[] nums) {
        String k="";
        for(int i:nums){

            k=k+i;
        }
        int [] arr = new int[k.length()];
        int i=0;
        for(char c: k.toCharArray()){
            arr[i++]=c-'0';
        }return arr;
    }
}