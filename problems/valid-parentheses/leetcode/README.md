# Valid Parentheses

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-valid-parentheses` |
| Topics | String, Stack, Bracket Sequences |
| Solved | 2025-10-30 |
| Runtime | 0 ms (beats 100%) |
| Memory | 12.6 MB (beats 11.526299999999985%) |

## Problem Statement

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

	- Open brackets must be closed by the same type of brackets.

	- Open brackets must be closed in the correct order.

	- Every close bracket has a corresponding open bracket of the same type.

 

**Example 1:**

**Input:** s = "()"

**Output:** true

**Example 2:**

**Input:** s = "()[]{}"

**Output:** true

**Example 3:**

**Input:** s = "(]"

**Output:** false

**Example 4:**

**Input:** s = "([])"

**Output:** true

**Example 5:**

**Input:** s = "([)]"

**Output:** false

 

**Constraints:**

	- `1 <= s.length <= 104`

	- `s` consists of parentheses only `'()[]{}'`.

## Hints

<details>
<summary>Hint 1</summary>

Use a stack of characters.

</details>

<details>
<summary>Hint 2</summary>

When you encounter an opening bracket, push it to the top of the stack.

</details>

<details>
<summary>Hint 3</summary>

When you encounter a closing bracket, check if the top of the stack was the opening for it. If yes, pop it from the stack. Otherwise, return false.

</details>

## Solutions

```Python
class Solution(object):
    def isValid(self, s):
        stack =[]
        mapping = {')':'(','}':'{',']':'['}

        for c in s:
            if c in mapping:
                if stack and stack[-1] == mapping[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)
        return not stack
```
