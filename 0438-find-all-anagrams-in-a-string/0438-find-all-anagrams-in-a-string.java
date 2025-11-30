class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         // storing p in map taking frequence of each char
         //using window in while if char is contains in map it will decrement the freq 
         // then if freq of char is 0 just move the window 
         //if exist store idx in list
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        for (char c : p.toCharArray()) {
             map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int wstart =0 , idx=0;
        for(int wend =0 ; wend < s.length() ; wend++ ){
            char c = s.charAt(wend);
            if(map.containsKey(c)){
                map.put(c , map.get(c)-1);
                if(map.get(c)==0)idx++;
            }
            if(idx == map.size()) result.add(wstart);
            if(wend -wstart +1 == p.length()){
                    
            }
            if (wend - wstart + 1 == p.length()) {
                char left = s.charAt(wstart++);
                if (map.containsKey(left)) {
                    if (map.get(left) == 0) idx--;
                    map.put(left, map.get(left) + 1);
                }
            }
        }return result;

    }
}