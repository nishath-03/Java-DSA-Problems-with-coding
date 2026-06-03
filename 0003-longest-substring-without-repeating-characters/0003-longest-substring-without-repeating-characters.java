class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
       int j=0;
       for(int i=0;i<s.length();i++){
        j=i;
           HashSet<Character> seen = new HashSet<>();
           while(j<s.length()){
            char currentChar = s.charAt(j);
                
                if (!seen.contains(currentChar)) {
                    seen.add(currentChar);
                    j++;
                } else {
                    break; 
                }
            }
            max = Math.max(max,j-i);
        }return max;
    }
}