# Koko Eating Bananas

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-koko-eating-bananas` |
| Topics | Array, Binary Search |
| Solved | 2026-10-07 |
| Runtime | 9 ms (beats 56.93479999999999%) |
| Memory | 47.7 MB (beats 73.53399999999995%) |

## Problem Statement

Koko loves to eat bananas. There are `n` piles of bananas, the `ith` pile has `piles[i]` bananas. The guards have gone and will come back in `h` hours.

Koko can decide her bananas-per-hour eating speed of `k`. Each hour, she chooses some pile of bananas and eats `k` bananas from that pile. If the pile has less than `k` bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return _the minimum integer_ `k` _such that she can eat all the bananas within_ `h` _hours_.

 

**Example 1:**

**Input:** piles = [3,6,7,11], h = 8
**Output:** 4

**Example 2:**

**Input:** piles = [30,11,23,4,20], h = 5
**Output:** 30

**Example 3:**

**Input:** piles = [30,11,23,4,20], h = 6
**Output:** 23

 

**Constraints:**

	- `1 <= piles.length <= 104`

	- `piles.length <= h <= 109`

	- `1 <= piles[i] <= 109`

## Solutions

```Java
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = -1;
        while(l <= r){
            int m = l + (r - l)/2;
            long minHour = timeTaken(piles, m);
            if(minHour <= h){
                ans = m;
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }

    public long timeTaken(int[] piles, int m){
        long total = 0;
        for(int num : piles){
            total += (num + m -1)/m;
        }
        return total;
    }
}
```
