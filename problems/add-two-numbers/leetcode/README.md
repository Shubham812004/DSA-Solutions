# Add Two Numbers

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-add-two-numbers` |
| Topics | Linked List, Math, Recursion |
| Solved | 2025-10-21 |
| Runtime | 4 ms (beats 82.09779999999999%) |
| Memory | 12.7 MB (beats 23.02019999999999%) |

## Problem Statement

You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

**Example 1:**

**Input:** l1 = [2,4,3], l2 = [5,6,4]
**Output:** [7,0,8]
**Explanation:** 342 + 465 = 807.

**Example 2:**

**Input:** l1 = [0], l2 = [0]
**Output:** [0]

**Example 3:**

**Input:** l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
**Output:** [8,9,9,9,0,0,0,1]

 

**Constraints:**

	- The number of nodes in each linked list is in the range `[1, 100]`.

	- `0 <= Node.val <= 9`

	- It is guaranteed that the list represents a number that does not have leading zeros.

## Solutions

```Python
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        dummy = ListNode()
        curr = dummy
        carry = 0

        while l1 or l2 or carry:
            c = carry

            if l1:
                c += l1.val
                l1 = l1.next

            if l2:
                c += l2.val
                l2 = l2.next

            curr.next = ListNode(c % 10)
            curr = curr.next
            carry = c // 10   

        return dummy.next   
```
