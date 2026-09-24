# Valid Palindrome

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-valid-palindrome` |
| Topics | String, Two Pointers |
| Solved | 2026-09-24 |
| Runtime | 2 ms (beats 99.2813%) |
| Memory | 44.5 MB (beats 53.026700000000005%) |

## Problem Statement

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true`_ if it is a **palindrome**, or _`false`_ otherwise_.

 

**Example 1:**

**Input:** s = "A man, a plan, a canal: Panama"
**Output:** true
**Explanation:** "amanaplanacanalpanama" is a palindrome.

**Example 2:**

**Input:** s = "race a car"
**Output:** false
**Explanation:** "raceacar" is not a palindrome.

**Example 3:**

**Input:** s = " "
**Output:** true
**Explanation:** s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

 

**Constraints:**

	- `1 <= s.length <= 2 * 105`

	- `s` consists only of printable ASCII characters.

## Solutions

```Java
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        int l = 0;
        int r = s.length()-1;
        while(l <= r){
            if(!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            else if(!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            else if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}
```
