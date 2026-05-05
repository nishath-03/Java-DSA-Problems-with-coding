class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();
        if(nums.length == 0) return ls;

        int start = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(i == nums.length - 1 || nums[i] + 1 != nums[i+1]) {

                if(start == nums[i]) {
                    ls.add(String.valueOf(start));
                } else {
                    ls.add(start + "->" + nums[i]);
                }

                if(i < nums.length - 1) {
                    start = nums[i+1];
                }
            }
        }

        return ls;
    }
}