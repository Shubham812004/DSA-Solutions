# Zigzag Conversion

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-zigzag-conversion` |
| Topics | String |
| Solved | 2025-10-23 |
| Runtime | 15 ms (beats 43.34890000000002%) |
| Memory | 12.4 MB (beats 56.817399999999985%) |

## Problem Statement

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: `"PAHNAPLSIIGYIR"`

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

 

**Example 1:**

**Input:** s = "PAYPALISHIRING", numRows = 3
**Output:** "PAHNAPLSIIGYIR"

**Example 2:**

**Input:** s = "PAYPALISHIRING", numRows = 4
**Output:** "PINALSIGYAHRPI"
**Explanation:**
P     I    N
A   L S  I G
Y A   H R
P     I

**Example 3:**

**Input:** s = "A", numRows = 1
**Output:** "A"

 

**Constraints:**

	- `1 <= s.length <= 1000`

	- `s` consists of English letters (lower-case and upper-case), `','` and `'.'`.

	- `1 <= numRows <= 1000`

## Solutions

```Python
class Solution(object):
    def convert(self, s, numrows):
        if numrows == 1 or numrows >= len(s):
            return s

        rows = [""] * numrows
        curr_row = 0
        going_down = False

        for c in s:
            rows[curr_row] += c

            if curr_row == 0 or curr_row == numrows -1:
                going_down = not going_down
            curr_row +=1 if going_down else -1
        return "".join(rows)        
```
