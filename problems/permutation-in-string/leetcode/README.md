# Permutation in String

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-permutation-in-string` |
| Topics | String, Hash Table, Two Pointers, Sliding Window |
| Solved | 2026-09-30 |
| Runtime | 5 ms (beats 98.318%) |
| Memory | 44.3 MB (beats 34.415000000000006%) |

## Problem Statement

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

 

**Example 1:**

**Input:** s1 = "ab", s2 = "eidbaooo"
**Output:** true
**Explanation:** s2 contains one permutation of s1 ("ba").

**Example 2:**

**Input:** s1 = "ab", s2 = "eidboaoo"
**Output:** false

 

**Constraints:**

	- `1 <= s1.length, s2.length <= 104`

	- `s1` and `s2` consist of lowercase English letters.

## Solutions

```Java
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        for(char ch : s1.toCharArray()){
            freq1[ch - 'a']++;
        }

        int[] freq2 = new int[26];
        int l = 0;
        for(int r=0; r<s2.length(); r++){
            freq2[s2.charAt(r) - 'a']++;

            while(r-l+1 > s1.length()){
                freq2[s2.charAt(l) - 'a']--;
                l++;
            }

            if(Arrays.equals(freq1, freq2)) return true;
        }
        return false;
    }
}
```
