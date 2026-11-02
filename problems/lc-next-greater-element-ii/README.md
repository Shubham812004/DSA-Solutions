# Next Greater Element II

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-next-greater-element-ii` |
| Topics | Array, Stack, Monotonic Stack |
| Solved | 2026-11-02 |
| Runtime | 14 ms (beats 60.89859999999998%) |
| Memory | 48.1 MB (beats 74.66790000000003%) |

## Problem Statement

Given a circular integer array `nums` (i.e., the next element of `nums[nums.length - 1]` is `nums[0]`), return _the **next greater number** for every element in_ `nums`.

The **next greater number** of a number `x` is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return `-1` for this number.

 

**Example 1:**

**Input:** nums = [1,2,1]
**Output:** [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.

**Example 2:**

**Input:** nums = [1,2,3,4,3]
**Output:** [2,3,4,-1,4]

 

**Constraints:**

	- `1 <= nums.length <= 104`

	- `-109 <= nums[i] <= 109`

## Solutions

```Java
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i=2*n-1; i>=0; i--){
            int num = nums[i%n];
            while(!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }
            if(i < n && !stack.isEmpty()){
                res[i] = stack.peek();
            }
            stack.push(num);
        }
        return res;
    }
}
```
