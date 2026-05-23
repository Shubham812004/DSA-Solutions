# Minimum Swaps to Move Zeros to End

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-minimum-swaps-to-move-zeros-to-end` |
| Topics | Array, Two Pointers |
| Solved | 2026-05-23 |
| Runtime | 1 ms (beats 99.5037%) |
| Memory | 46.5 MB (beats 26.30289999999999%) |

## Problem Statement

You are given an integer array `nums`.

In one operation, you can choose any two **distinct** indices `i` and `j` and swap `nums[i]` and `nums[j]`.

Return an integer denoting the **minimum** number of operations required to move all 0s to the end of the array.

 

**Example 1:**

**Input:** nums = [0,1,0,3,12]

**Output:** 2

**Explanation:**

We perform the following swap operations:

	- Swap `nums[0]` and `nums[3]`, giving `nums = [3, 1, 0, 0, 12]`.

	- Swap `nums[2]` and `nums[4]`, giving `nums = [3, 1, 12, 0, 0]`.

Thus, the answer is 2.

**Example 2:**

**Input:** nums = [0,1,0,2]

**Output:** 1

**Explanation:**

We perform the following swap operations:

	- Swap `nums[0]` and `nums[3]`, giving `nums = [2, 1, 0, 0]`.

Thus, the answer is 1.

**Example 3:**

**Input:** nums = [1,2,0]

**Output:** 0

**Explanation:**

The array already satisfies the condition. Therefore, no swap operations are needed.

 

**Constraints:**

	- `1 <= nums.length <= 100`

	- `0 <= nums[i] <= 100`

## Hints

<details>
<summary>Hint 1</summary>

The values of non-zero elements do not matter.
Convert the array to zeros and ones.

</details>

<details>
<summary>Hint 2</summary>

All ones that are in positions where a zero should be must be swapped out.

</details>

## Solutions

```Java
class Solution {
    public int minimumSwaps(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int count = 0;
        while(i < j){
            while(i < j && nums[i] != 0){
                i++;
            }
            while(i < j && nums[j] == 0){
                j--;
            }
            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}
```
