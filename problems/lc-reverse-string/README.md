# Reverse String

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-reverse-string` |
| Topics | Two Pointers, String |
| Solved | 2026-09-23 |
| Runtime | 0 ms (beats 100%) |
| Memory | 48.1 MB (beats 73.53929999999998%) |

## Problem Statement

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

**Example 1:**

**Input:** s = ["h","e","l","l","o"]
**Output:** ["o","l","l","e","h"]
**Example 2:**

**Input:** s = ["H","a","n","n","a","h"]
**Output:** ["h","a","n","n","a","H"]

 

**Constraints:**

	- `1 <= s.length <= 105`

	- `s[i]` is a printable ascii character.

## Hints

<details>
<summary>Hint 1</summary>

The entire logic for reversing a string is based on using the opposite directional two-pointer approach!

</details>

## Solutions

```Java
class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        while(l <= r){
            swap(s, l, r);
            l++;
            r--;
        }
        
    }
    public void swap(char[] s, int l, int r){
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }
}
```
