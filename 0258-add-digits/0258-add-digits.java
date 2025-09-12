class Solution {
    public int addDigits(int num) {
        int temp = num;
        int sum;
        while (temp >= 10) {
            sum = 0;
            while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
            }temp = sum;
        }return temp;
    }
}
