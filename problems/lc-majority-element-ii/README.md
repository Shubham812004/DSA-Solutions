# Majority Element II

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-majority-element-ii` |
| Topics | Array, Hash Table, Sorting, Counting, Boyer–moore Majority Vote Algorithm |
| Solved | 2026-04-29 |
| Runtime | 2 ms (beats 99.88900000000001%) |
| Memory | 52.6 MB (beats 40.50650000000003%) |

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
        List<Integer> res = new ArrayList<>();
        int count1 =0, element1 = 0, count2 =0, element2 = 0;
        for(int num : nums){
            if(element1 == num){
                count1++;
            }else if(element2 == num){
                count2++;
            }else if(count1 == 0){
                element1 = num;
                count1 = 1;
            }else if(count2 == 0){
                element2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == element1) count1++;
            else if(num == element2) count2++;
        }
        int n = nums.length;
        if(count1 > n/3) res.add(element1);
        if(count2 > n/3) res.add(element2);
        return res;
    }
}
```
