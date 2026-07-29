# Longest Repeating Character Replacement

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-longest-repeating-character-replacement` |
| Topics | String, Hash Table, Sliding Window |
| Solved | 2026-07-29 |
| Runtime | 7 ms (beats 91.31040000000002%) |
| Memory | 46 MB (beats 63.453599999999966%) |

## Problem Statement

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return _the length of the longest substring containing the same letter you can get after performing the above operations_.

 

**Example 1:**

**Input:** s = "ABAB", k = 2
**Output:** 4
**Explanation:** Replace the two 'A's with two 'B's or vice versa.

**Example 2:**

**Input:** s = "AABABBA", k = 1
**Output:** 4
**Explanation:** Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.

 

**Constraints:**

	- `1 <= s.length <= 105`

	- `s` consists of only uppercase English letters.

	- `0 <= k <= s.length`

## Solutions

```Java
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0;
        int maxLen = 0;
        int maxFreq = 0;
        for(int r=0; r<s.length(); r++){
            char ch = s.charAt(r);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
            while((r-l+1) - maxFreq > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
```
