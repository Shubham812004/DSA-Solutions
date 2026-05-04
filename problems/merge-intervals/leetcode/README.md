# Merge Intervals

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-merge-intervals` |
| Topics | Array, Sorting, Quicksort |
| Solved | 2026-05-04 |
| Runtime | 7 ms (beats 98.8287%) |
| Memory | 49.3 MB (beats 14.1785%) |

## Problem Statement

Given an array of `intervals` where `intervals[i] = [starti, endi]`, merge all overlapping intervals, and return _an array of the non-overlapping intervals that cover all the intervals in the input_.

 

**Example 1:**

**Input:** intervals = [[1,3],[2,6],[8,10],[15,18]]
**Output:** [[1,6],[8,10],[15,18]]
**Explanation:** Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

**Example 2:**

**Input:** intervals = [[1,4],[4,5]]
**Output:** [[1,5]]
**Explanation:** Intervals [1,4] and [4,5] are considered overlapping.

**Example 3:**

**Input:** intervals = [[4,7],[1,4]]
**Output:** [[1,7]]
**Explanation:** Intervals [1,4] and [4,7] are considered overlapping.

 

**Constraints:**

	- `1 <= intervals.length <= 104`

	- `intervals[i].length == 2`

	- `0 <= starti <= endi <= 104`

## Solutions

```Java
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=0; i<intervals.length; i++){
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if(nextStart <= end){
                end = Math.max(end, nextEnd);
            }
            else{
                res.add(new int[]{start, end});
                start = nextStart;
                end = nextEnd;
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[res.size()][]);
    }
}
```
