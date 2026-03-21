class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ls = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
             HashSet<Integer>set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                List<Integer>res = new ArrayList<>();
                int target = -1*(nums[i]+nums[j]);
                if(set.contains(target)){
                    res.add(target);
                    res.add(nums[i]);
                    res.add(nums[j]);
                    Collections.sort(res);
                    ls.add(res);
                    
                }set.add(nums[j]);
                
            }
        }return new ArrayList<>(ls);
        
    }
    
}
