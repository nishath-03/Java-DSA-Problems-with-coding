class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length())
            return false;
        int k = s1.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int wstart = 0, match = 0;
        for (int wend = 0; wend < s2.length(); wend++) {
            char right = s2.charAt(wend);
            if (map.containsKey(right)) {
                map.put(right, map.get(right) - 1);
                if (map.get(right) == 0)
                    match++;
            }
            if (wend - wstart + 1 == k) {
                if (match == map.size())
                    return true;
                char left = s2.charAt(wstart);
                if (map.containsKey(left)) {
                    if (map.get(left) == 0)
                        match--;
                    map.put(left, map.get(left) + 1);
                }
                wstart++;

            }
        }
        return false;
    }
}