class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] arr = new String[strs.length];
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
           String key = srt(s);
           if(!map.containsKey(key)){
              map.put(key, new ArrayList<>());
           }
           map.get(key).add(s);
        }return new ArrayList(map.values());
       
    }
    static String srt(String s){
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
}