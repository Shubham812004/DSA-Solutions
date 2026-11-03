# Split Array Largest Sum

| Field | Value |
|-------|-------|
| Difficulty | Hard |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-split-array-largest-sum-141634` |
| Topics | Array, Binary Search |
| Solved | 2026-10-14 |
| Solve Time | 1m 31s |

## Problem Statement

Given an array **arr[]** and an integer **k**, divide the array into **k** contiguous subarrays such that the **maximum **sum among these subarrays is **minimized**. Find this minimum possible **maximum sum**.

**Examples:**

**Input: **arr[] = [1, 2, 3, 4], k = 3**
Output: **4**
Explanation: **Optimal Split is [1, 2], [3], [4]. Maximum sum of all subarrays is 4, which is minimum possible for 3 splits.
**Input: **arr[] = [1, 1, 2], k = 2
**Output: **2
**Explanation: **Splitting the array as [1, 1] and [2] is optimal. This results in a maximum sum subarray of 2.**Constraints:
**1 &le; k &le; arr.size() &le; 105
1 &le; arr[i] &le; 104

## Solutions

```Java
class Solution {
	public int splitArray(int[] arr, int k) {
		// code here
		if (k > arr.length)
			return - 1;
		int l = Arrays.stream(arr).max().getAsInt();
		int h = 0;
		for (int num : arr) {
			h += num;
		}
		int ans = -1;
		while (l <= h) {
			int m = l + (h - l)/2;
			if (helper(arr, k, m)) {
				ans = m;
				h = m - 1;
			}
			else {
				l = m + 1;
			}
		}
		return ans;
	}
	
	public boolean helper(int[] arr, int k, int m){
         int count = 1;
         int sum = 0;
         for(int num : arr){
             if(sum + num <= m){
                 sum += num;
             }
             else{
                 count++;
                 sum = num;
             }
         }
         return count <= k;
     }
}

```
