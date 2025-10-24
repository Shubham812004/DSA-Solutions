# Valid Anagram

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-valid-anagram` |
| Topics | String, Hash Table, Sorting |
| Solved | 2025-10-24 |
| Runtime | 23 ms (beats 46.713400000000036%) |
| Memory | 13.5 MB (beats 21.201000000000015%) |

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

```Python
class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False
    
        return sorted(s) == sorted(t)

        
```
