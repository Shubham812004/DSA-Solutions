class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] char1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(char1);
        String s1 = new String(chars);
        String s2 = new String(char1);
        return s1.equals(s2);
    }
}