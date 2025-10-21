# Longest Substring Without Repeating Characters

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-longest-substring-without-repeating-characters` |
| Topics | String, Hash Table, Sliding Window |
| Solved | 2025-10-21 |
| Runtime | 2941 ms (beats 5.004000000000249%) |
| Memory | 14.3 MB (beats 66.23090000000002%) |

## Problem Statement

Given a string `s`, find the length of the **longest** **substring** without duplicate characters.

 

**Example 1:**

**Input:** s = "abcabcbb"
**Output:** 3
**Explanation:** The answer is "abc", with the length of 3. Note that `"bca"` and `"cab"` are also correct answers.

**Example 2:**

**Input:** s = "bbbbb"
**Output:** 1
**Explanation:** The answer is "b", with the length of 1.

**Example 3:**

**Input:** s = "pwwkew"
**Output:** 3
**Explanation:** The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 

**Constraints:**

	- `0 <= s.length <= 105`

	- `s` consists of English letters, digits, symbols and spaces.

## Hints

<details>
<summary>Hint 1</summary>

There are less than 100 unique characters. We can check all substrings with length at most 100 for example. This is a good enough approximation.

</details>

## Solutions

```Python
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        n = len(s)
        result = 0
        for i in range(n):
            seen = set()
            for j in range(i,n):
                if s[j] in seen:
                    break
                else:
                    seen.add(s[j])
                    result = max(result, j-i+1)
        return result
        
```
