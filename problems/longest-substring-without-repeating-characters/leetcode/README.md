# Longest Substring Without Repeating Characters

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-longest-substring-without-repeating-characters` |
| Topics | String, Hash Table, Sliding Window |
| Solved | 2026-11-12 |
| Runtime | 69 ms (beats 28.07519999999999%) |
| Memory | 47.2 MB (beats 94.92400000000002%) |

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

## Solutions

```Java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int l = 0;
        for(int r=0; r<s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
            set.add(s.charAt(r));
        }
        return maxLen;
    }
}
```
