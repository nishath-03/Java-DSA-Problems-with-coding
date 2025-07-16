class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for(char k : s.toCharArray()){
            if(Character.isLetterOrDigit(k)){
                cleaned.append(Character.toLowerCase(k));
            }
        }



        int left =0;
        int right = cleaned.length() -1;
        while(left<right){
            if(cleaned.charAt(left)!=(cleaned.charAt(right))){
                return false;

            }left++;
            right--;
        }return true;
    }
    
}