# Longest Palindromic Substring

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-longest-palindromic-substring` |
| Topics | String, Two Pointers, Dynamic Programming, Manacher |
| Solved | 2026-09-30 |
| Runtime | 14 ms (beats 93.34519999999998%) |
| Memory | 43.4 MB (beats 78.13889999999998%) |

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
        for(int i=0; i<s.length(); i++){
            int odd = palindrome(s, i, i);
            int even = palindrome(s, i, i+1);
            int max = Math.max(odd, even);
            if(max > (end - start)){
                start = i - (max-1)/2;
                end = i + max/2;
            }
        }
        return s.substring(start, end+1);
    }
    public int palindrome(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}
```
