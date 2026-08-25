class Solution {
    public void reverseString(char[] s) {
        recur(s, 0, s.length-1);
    }
    void recur(char[]s, int start, int end){
        if(start>=end)return;
        char temp = s[start];
        s[start]=s[end];
        s[end]=temp;
        recur(s,start+1,end-1);
    }
}