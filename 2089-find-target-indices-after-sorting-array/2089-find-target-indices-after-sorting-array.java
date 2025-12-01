class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();

        int less = 0, equal = 0;

        for (int num : nums) {
            if (num < target) less++;
            else if (num == target) equal++;
        }

        // target will start from index is less
        for (int i = 0; i < equal; i++) {
            res.add(less + i);
        }

        return res;
    }
}
