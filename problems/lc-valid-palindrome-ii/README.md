# Valid Palindrome II

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-valid-palindrome-ii` |
| Topics | Two Pointers, String, Greedy |
| Solved | 2026-09-24 |
| Runtime | 4 ms (beats 98.1998%) |
| Memory | 47.6 MB (beats 84.23840000000001%) |

## Problem Statement

Given a string `s`, return `true` _if the _`s`_ can be palindrome after deleting **at most one** character from it_.

 

**Example 1:**

**Input:** s = "aba"
**Output:** true

**Example 2:**

**Input:** s = "abca"
**Output:** true
**Explanation:** You could delete the character 'c'.

**Example 3:**

**Input:** s = "abc"
**Output:** false

 

**Constraints:**

	- `1 <= s.length <= 105`

	- `s` consists of lowercase English letters.

## Solutions

```Java
class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) return true;
        int l = 0;
        int r = s.length()-1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return isPalindrome(s, l+1, r) || isPalindrome(s, l, r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isPalindrome(String s, int l, int r){
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
```
