public class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0, count = 1; j < result.length(); j++, count = 1) {
                while (j + 1 < result.length() && result.charAt(j) == result.charAt(j + 1)) {
                    count++;
                    j++;
                }
                sb.append(count).append(result.charAt(j));
            }
            result = sb.toString();
        }return result;
    }
}
