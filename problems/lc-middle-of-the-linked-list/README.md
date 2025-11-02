# Middle of the Linked List

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-middle-of-the-linked-list` |
| Topics | Linked List, Two Pointers |
| Solved | 2025-11-02 |
| Runtime | 0 ms (beats 100%) |
| Memory | 12.5 MB (beats 24.05690000000002%) |

## Problem Statement

Given the `head` of a singly linked list, return _the middle node of the linked list_.

If there are two middle nodes, return **the second middle** node.

 

**Example 1:**

**Input:** head = [1,2,3,4,5]
**Output:** [3,4,5]
**Explanation:** The middle node of the list is node 3.

**Example 2:**

**Input:** head = [1,2,3,4,5,6]
**Output:** [4,5,6]
**Explanation:** Since the list has two middle nodes with values 3 and 4, we return the second one.

 

**Constraints:**

	- The number of nodes in the list is in the range `[1, 100]`.

	- `1 <= Node.val <= 100`

## Solutions

```Python
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def middleNode(self, head):
        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        return slow
```
