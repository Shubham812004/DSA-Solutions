class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(str.length != pattern.length()) return false;
        Map<Character, String> mapPS = new HashMap<>();
        Map<String, Character> mapSP = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = str[i];
            if(mapPS.containsKey(ch) && !mapPS.get(ch).equals(word)) return false;
            if(mapSP.containsKey(word) && ch != mapSP.get(word)) return false;
            mapPS.put(ch, word);
            mapSP.put(word, ch);
        }
        return true;
    }
}