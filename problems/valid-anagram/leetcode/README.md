# Valid Anagram

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-valid-anagram` |
| Topics | String, Hash Table, Sorting |
| Solved | 2026-09-02 |
| Runtime | 6 ms (beats 45.7278%) |
| Memory | 44.5 MB (beats 65.04800000000002%) |

## Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

**Example 1:**

**Input:** s = "anagram", t = "nagaram"

**Output:** true

**Example 2:**

**Input:** s = "rat", t = "car"

**Output:** false

 

**Constraints:**

	- `1 <= s.length, t.length <= 5 * 104`

	- `s` and `t` consist of lowercase English letters.

 

**Follow up:** What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solutions

```Java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int num : count){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
```
