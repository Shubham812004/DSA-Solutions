# Daily Temperatures

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-daily-temperatures` |
| Topics | Array, Stack, Monotonic Stack |
| Solved | 2026-11-03 |
| Runtime | 92 ms (beats 5.456300000000013%) |
| Memory | 105.9 MB (beats 76.79609999999992%) |

## Problem Statement

Given an array of integers `temperatures` represents the daily temperatures, return _an array_ `answer` _such that_ `answer[i]` _is the number of days you have to wait after the_ `ith` _day to get a warmer temperature_. If there is no future day for which this is possible, keep `answer[i] == 0` instead.

 

**Example 1:**

**Input:** temperatures = [73,74,75,71,69,72,76,73]
**Output:** [1,1,4,2,1,1,0,0]
**Example 2:**

**Input:** temperatures = [30,40,50,60]
**Output:** [1,1,1,0]
**Example 3:**

**Input:** temperatures = [30,60,90]
**Output:** [1,1,0]

 

**Constraints:**

	- `1 <= temperatures.length <= 105`

	- `30 <= temperatures[i] <= 100`

## Solutions

```Java
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Arrays.fill(res, 0);
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= temperatures[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res[i] = map.get(stack.peek()) - i;
            }
            stack.push(temperatures[i]);
            map.put(temperatures[i], i);
        }
        return res;
    }
}
```
