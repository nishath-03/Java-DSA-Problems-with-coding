class Solution {
    public int mirrorFrequency(String s) {
        int freq[]= new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        int total = 0;
        for(int i=0;i<13;i++){
            total += Math.abs(freq['a'+i]-freq['z'-i]);
        }
        for(int i=0;i<5;i++){
            total+=Math.abs(freq['0'+i]-freq['9'-i]);
        }return total;
    }
}