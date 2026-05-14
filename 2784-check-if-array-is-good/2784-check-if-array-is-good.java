class Solution {
    public boolean isGood(int[] nums) {
        if(nums.length <=1) return false;
        int length = nums.length -1;
        
        HashMap<Integer, Integer> map = new HashMap();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getKey()<length){
                if(e.getValue()!=1) return false;
            }
            else if(e.getKey()==length){
                if(e.getValue() != 2) return false;
            }
            else{return false;}
        }return true;
    }
}