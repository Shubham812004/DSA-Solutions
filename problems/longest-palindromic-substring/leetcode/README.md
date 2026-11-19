# Longest Palindromic Substring

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-longest-palindromic-substring` |
| Topics | String, Two Pointers, Dynamic Programming, Manacher |
| Solved | 2026-11-19 |
| Runtime | 14 ms (beats 93.72039999999998%) |
| Memory | 43 MB (beats 83.27730000000003%) |

## Problem Statement

Given a string `s`, return _the longest_ _palindromic_ _substring_ in `s`.

 

**Example 1:**

**Input:** s = "babad"
**Output:** "bab"
**Explanation:** "aba" is also a valid answer.

**Example 2:**

**Input:** s = "cbbd"
**Output:** "bb"

 

**Constraints:**

	- `1 <= s.length <= 1000`

	- `s` consist of only digits and English letters.

## Solutions

```Java
class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int len = 0;
        for(int i=0; i<s.length(); i++){
            int odd = isPalindrome(s, i, i);
            int even = isPalindrome(s, i, i+1);
            len = Math.max(odd, even);

            if(len > end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }
    int isPalindrome(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}
```
