class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set = new HashSet<>();
        int wstart=0;
        int max = 0;

        for(int wend= 0;wend<s.length();wend++){
            while(set.contains(s.charAt(wend))){
                
                set.remove(s.charAt(wstart));
                wstart++;
            }
            set.add(s.charAt(wend));
            max = Math.max(max , wend - wstart +1);
            
        }return max;
    }
}