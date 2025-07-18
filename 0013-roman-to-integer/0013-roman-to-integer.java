class Solution {
    public int romanToInt(String s) {
      Scanner in = new Scanner(System.in);
        
        HashMap<Character,Integer> roman =new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);       
        roman.put('L',50);   
        roman.put('C',100);   
        roman.put('D',500);   
        roman.put('M',1000);

        int sum=0;
        for(int i=0;i<s.length();i++){
            int curr_cr = roman.get(s.charAt(i));

            if(i+1 < s.length()){
                int next_val = roman.get(s.charAt(i+1));
                if(curr_cr < next_val){
                    sum -= curr_cr;
                }
                else{
                    sum += curr_cr;
                }
            }else{
                sum += curr_cr;
            }
        }   return sum;


    }
}