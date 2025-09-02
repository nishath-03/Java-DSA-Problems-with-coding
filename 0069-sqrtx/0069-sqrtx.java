class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int root = 1;
        for (int i = 1; i <= x / i; i++) {
            if (i == x / i) return i;
            root = i;
        }
        return root;
    }
}