# Valid Anagram

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-valid-anagram` |
| Topics | String, Hash Table, Sorting |
| Solved | 2026-05-16 |
| Runtime | 3 ms (beats 93.66650000000001%) |
| Memory | 46.8 MB (beats 8.789600000000014%) |

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
        char[] chars = s.toCharArray();
        char[] char1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(char1);
        String s1 = new String(chars);
        String s2 = new String(char1);
        return s1.equals(s2);
    }
}
```
