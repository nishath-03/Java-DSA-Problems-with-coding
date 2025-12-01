class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>arr.length /4) {return e.getKey();}
        }return -1;
    }
}