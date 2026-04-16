# Majority Element II

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-majority-element-ii` |
| Topics | Array, Hash Table, Sorting, Counting, Boyer–moore Majority Vote Algorithm |
| Solved | 2026-04-16 |
| Runtime | 14 ms (beats 42.35930000000001%) |
| Memory | 51 MB (beats 96.61570000000003%) |

## Problem Statement

Given an integer array of size `n`, find all elements that appear more than `&lfloor;n / 3&rfloor;` times.

 

**Example 1:**

**Input:** nums = [3,2,3]
**Output:** [3]

**Example 2:**

**Input:** nums = [1]
**Output:** [1]

**Example 3:**

**Input:** nums = [1,2]
**Output:** [1,2]

 

**Constraints:**

	- `1 <= nums.length <= 5 * 104`

	- `-109 <= nums[i] <= 109`

 

**Follow up:** Could you solve the problem in linear time and in `O(1)` space?

## Hints

<details>
<summary>Hint 1</summary>

Think about the possible number of elements that can appear more than ⌊ n/3 ⌋ times in the array.

</details>

<details>
<summary>Hint 2</summary>

It can be at most two. Why?

</details>

<details>
<summary>Hint 3</summary>

Consider using Boyer-Moore Voting Algorithm, which is efficient for finding elements that appear more than a certain threshold.

</details>

## Solutions

```Java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > n/3){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
```
