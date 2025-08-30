class Solution {
    public int countDigits(int num) {
        int temp=0,cnt=0,org=num;

       while(num>0){
            temp = num%10;
            if(org%temp ==0) cnt++;
            num/=10;
        }return cnt;
    }
}