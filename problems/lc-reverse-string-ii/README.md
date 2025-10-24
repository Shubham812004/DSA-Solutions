# Reverse String II

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-reverse-string-ii` |
| Topics | Two Pointers, String |
| Solved | 2025-10-24 |
| Runtime | 2 ms (beats 65.0765%) |
| Memory | 12.7 MB (beats 42.9342%) |

## Problem Statement

Given a string `s` and an integer `k`, reverse the first `k` characters for every `2k` characters counting from the start of the string.

If there are fewer than `k` characters left, reverse all of them. If there are less than `2k` but greater than or equal to `k` characters, then reverse the first `k` characters and leave the other as original.

 

**Example 1:**

**Input:** s = "abcdefg", k = 2
**Output:** "bacdfeg"
**Example 2:**

**Input:** s = "abcd", k = 2
**Output:** "bacd"

 

**Constraints:**

	- `1 <= s.length <= 104`

	- `s` consists of only lowercase English letters.

	- `1 <= k <= 104`

## Solutions

```Python
class Solution(object):
    def reverseStr(self, s, k):
        s = list(s)
        
        for i in range(0, len(s), 2 * k):
            s[i:i+k] = reversed(s[i:i+k])
            
        return "".join(s)

```
