# Longest Palindromic Substring

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-longest-palindromic-substring` |
| Topics | String, Two Pointers, Dynamic Programming, Manacher |
| Solved | 2025-10-23 |
| Runtime | 352 ms (beats 70.0691000000002%) |
| Memory | 12.6 MB (beats 7.174599999999998%) |

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

## Hints

<details>
<summary>Hint 1</summary>

How can we reuse a previously computed palindrome to compute a larger palindrome?

</details>

<details>
<summary>Hint 2</summary>

If “aba” is a palindrome, is “xabax” a palindrome? Similarly is “xabay” a palindrome?

</details>

<details>
<summary>Hint 3</summary>

Complexity based hint:
If we use brute-force and check whether for every start and end position a substring is a palindrome we have O(n^2) start - end pairs and O(n) palindromic checks. Can we reduce the time for palindromic checks to O(1) by reusing some previous computation.

</details>

## Solutions

```Python
class Solution:
    def longestPalindrome(self, s):
        if s == 0:
            return ""
        
        def expand(left, right):
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            return left + 1, right - 1
        
        start, end = 0, 0
        for i in range(len(s)):
            l1, r1 = expand(i, i)
            l2, r2 = expand(i, i + 1)
            
            if r1 - l1 > end - start:
                start, end = l1, r1
            if r2 - l2 > end - start:
                start, end = l2, r2
        
        return s[start:end + 1]
```
