# Group Anagrams

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-group-anagrams` |
| Topics | Array, String, Hash Table, Sorting |
| Solved | 2025-11-22 |
| Runtime | 23 ms (beats 48.209399999999995%) |
| Memory | 16.2 MB (beats 56.3027%) |

## Problem Statement

Given an array of strings `strs`, group the anagrams together. You can return the answer in **any order**.

 

**Example 1:**

**Input:** strs = ["eat","tea","tan","ate","nat","bat"]

**Output:** [["bat"],["nat","tan"],["ate","eat","tea"]]

**Explanation:**

	- There is no string in strs that can be rearranged to form `"bat"`.

	- The strings `"nat"` and `"tan"` are anagrams as they can be rearranged to form each other.

	- The strings `"ate"`, `"eat"`, and `"tea"` are anagrams as they can be rearranged to form each other.

**Example 2:**

**Input:** strs = [""]

**Output:** [[""]]

**Example 3:**

**Input:** strs = ["a"]

**Output:** [["a"]]

 

**Constraints:**

	- `1 <= strs.length <= 104`

	- `0 <= strs[i].length <= 100`

	- `strs[i]` consists of lowercase English letters.

## Solutions

```Python
class Solution(object):
    def groupAnagrams(self, strs):
        freq = {}
        for word in strs:
            sorted_word = ''.join(sorted(word))
            if sorted_word not in freq:
                freq[sorted_word] = []
            freq[sorted_word].append(word)
        return list(freq.values())
```
