class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
         

        int wstart =0 ,match=0 ,minLen=Integer.MAX_VALUE,minStart=0;
        for(int wend =0 ; wend<s.length();wend++){
            char right = s.charAt(wend);
            if(map.containsKey(right)){
               map.put(right , map.get(right)-1);
                if(map.get(right)==0)  match++;
            }  


             while (match == map.size()) {
                // Update best (smallest) window
                int windowLen = wend - wstart + 1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    minStart = wstart;
                }
                  
                char left = s.charAt(wstart);
                if (map.containsKey(left)) {
                     if (map.get(left) == 0) match--;
                       
                    map.put(left, map.get(left) + 1);

                }
                
                wstart++;

            }

        }
        if (minLen == Integer.MAX_VALUE) return "";
        return s.substring(minStart,minLen+minStart);

    }
}