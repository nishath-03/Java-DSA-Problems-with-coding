class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int idx = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean found = false;
                    for (int k = 0; k < idx; k++) {
                        if (res[k] == nums1[i]) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        res[idx++] = nums1[i];
                    }
                    break;
                }
            }
        }

        int[] ans = new int[idx];
        for (int i = 0; i < idx; i++) {
            ans[i] = res[i];
        }

        return ans;
    }
}
