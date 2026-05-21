class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer>res = new ArrayList<>();
        for(int i=1;i*i*i<n;i++){
            for(int j=i; ;j++){
                int sum = i*i*i+j*j*j;
                if(sum>n)break;
                counts.put(sum,counts.getOrDefault(sum,0)+1);
            }
        }
        for(int sum: counts.keySet()){
            if(counts.get(sum)>=2)res.add(sum);
        }
        Collections.sort(res);
        return res;
    }
}