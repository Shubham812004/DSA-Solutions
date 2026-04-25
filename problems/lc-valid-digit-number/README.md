# Valid Digit Number

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-valid-digit-number` |
| Topics | Math |
| Solved | 2026-04-25 |
| Runtime | 1 ms (beats 98.278%) |
| Memory | 42.7 MB (beats 27.429400000000005%) |

## Problem Statement

You are given an integer `n` and a digit `x`.

A number is considered **valid** if:

	- It contains **at least one** occurrence of digit `x`, and

	- It **does not start** with digit `x`.

Return `true` if `n` is **valid**, otherwise return `false`.

 

**Example 1:**

**Input:** n = 101, x = 0

**Output:** true

**Explanation:**

The number contains digit 0 at index 1. It does not start with 0, so it satisfies both conditions. Thus, the answer is `true`​​​​​​​.

**Example 2:**

**Input:** n = 232, x = 2

**Output:** false

**Explanation:**

The number starts with 2, which violates the condition. Thus, the answer is `false`.

**Example 3:**

**Input:** n = 5, x = 1

**Output:** false

**Explanation:**

The number does not contain digit 1. Thus, the answer is `false`.

 

**Constraints:**

	- `0 <= n <= 105​​​​​​​`

	- `0 <= x <= 9`

## Hints

<details>
<summary>Hint 1</summary>

Perform the checks as described

</details>

## Solutions

```Java
class Solution {
    public boolean validDigit(int n, int x) {
        String str = String.valueOf(n); 
        char X = (char)(x + '0');

        if(str.charAt(0) == X){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == X){
                return true;
            }
        }
        return false;
    }
}
```
