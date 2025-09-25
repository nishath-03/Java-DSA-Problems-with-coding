

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        for (int num : nums1) {
            count[num]++;
        }
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (count[num] > 0) {
                intersection.add(num);
                count[num]--;
            }
        }
        int[] result = new int[intersection.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = intersection.get(i);
        }return result;
    }
}
