class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        int k = p.length();
        int[] pFreq = new int[26];
        for(int i=0; i<k; i++){
            pFreq[p.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<=n-k; i++){
            int[] sFreq = new int[26];
            for(int j=i; j<i+k; j++){
                sFreq[s.charAt(j) - 'a']++;
            }
            if(Arrays.equals(sFreq, pFreq)) res.add(i);
        }
        return res;
    }
}