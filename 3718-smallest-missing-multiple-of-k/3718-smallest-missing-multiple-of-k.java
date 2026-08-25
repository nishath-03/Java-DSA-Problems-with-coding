class Solution {
    public int missingMultiple(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int temp=k;
        while(map.containsKey(temp)){
            temp+=k;
        }
        return temp;
    }
}