class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] answer = new int[n];

        // left arr
        int left = 0;
        for (int i = 0; i < n; i++) {
            leftSum[i] = left;
            left += nums[i];
        }

        // right arr
        int right = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = Math.abs(leftSum[i] - right);
            right += nums[i];
        }

        return answer;
    }
}
