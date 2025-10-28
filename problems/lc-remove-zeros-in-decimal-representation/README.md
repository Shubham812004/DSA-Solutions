# Remove Zeros in Decimal Representation

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-remove-zeros-in-decimal-representation` |
| Topics | Math, Simulation |
| Solved | 2025-10-28 |
| Runtime | 0 ms (beats 100%) |
| Memory | 12.5 MB (beats 22.641400000000004%) |

## Problem Statement

You are given a **positive** integer `n`.

Return the integer obtained by removing all zeros from the decimal representation of `n`.

 

**Example 1:**

**Input:** n = 1020030

**Output:** 123

**Explanation:**

After removing all zeros from 1**0**2**00**3**0**, we get 123.

**Example 2:**

**Input:** n = 1

**Output:** 1

**Explanation:**

1 has no zero in its decimal representation. Therefore, the answer is 1.

 

**Constraints:**

	- `1 <= n <= 1015`

## Hints

<details>
<summary>Hint 1</summary>

Convert to a string and filter out the `'0'` characters.

</details>

## Solutions

```Python
class Solution(object):
    def removeZeros(self, n):
        return int(str(n).replace('0', ''))
        """
        :type n: int
        :rtype: int
        """
        
```
