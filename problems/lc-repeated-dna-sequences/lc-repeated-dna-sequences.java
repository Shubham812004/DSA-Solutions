class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        int l = 0;
        int r = 9;
        while(r < s.length()){
            String dna = s.substring(l, r+1);
            map.put(dna, map.getOrDefault(dna, 0)+1);
            l++;
            r++;
        }
        List<String> res = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int val = entry.getValue();
            if(val > 1){
                res.add(key);
            }
        }
        return res;
    }
}