class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {

        int len = words.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (words[i].equals(target)) {
                int direct = Math.abs(i - startIndex);
                int circular = len - direct;
                ans = Math.min(ans, Math.min(direct, circular));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}