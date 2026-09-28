# Find All Anagrams in a String

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-find-all-anagrams-in-a-string` |
| Topics | Hash Table, String, Sliding Window |
| Solved | 2026-09-28 |
| Runtime | 359 ms (beats 11.50430000000003%) |
| Memory | 47.3 MB (beats 26.90329999999995%) |

## Problem Statement

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in **any order**.

 

**Example 1:**

**Input:** s = "cbaebabacd", p = "abc"
**Output:** [0,6]
**Explanation:**
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

**Example 2:**

**Input:** s = "abab", p = "ab"
**Output:** [0,1,2]
**Explanation:**
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

 

**Constraints:**

	- `1 <= s.length, p.length <= 3 * 104`

	- `s` and `p` consist of lowercase English letters.

## Solutions

```Java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        int k = p.length();
        int[] kCount = new int[26];
        for(char c : p.toCharArray()){
            kCount[c - 'a']++;
        }
        for(int i=0; i<=n-k; i++){
            int[] sCount = new int[26];
            for(int j=i; j<i+k; j++){
                sCount[s.charAt(j) - 'a']++;
            }
            if(Arrays.equals(sCount, kCount)) res.add(i);
        }
        return res;
    }
}
```
