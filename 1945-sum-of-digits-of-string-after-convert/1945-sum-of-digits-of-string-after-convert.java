class Solution {
    public int getLucky(String s, int k) {
        StringBuilder numStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            numStr.append(c -'a'+1);
        } 
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (char c : numStr.toString().toCharArray()) {
                sum += c - '0';
            }
            numStr = new StringBuilder(String.valueOf(sum));
        }return sum;
    }
}
