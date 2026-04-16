# Pascal's Triangle

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-pascals-triangle` |
| Topics | Array, Dynamic Programming |
| Solved | 2026-04-16 |
| Runtime | 1 ms (beats 95.3754%) |
| Memory | 43 MB (beats 96.393%) |

## Problem Statement

Given an integer `numRows`, return the first numRows of **Pascal's triangle**.

In **Pascal's triangle**, each number is the sum of the two numbers directly above it as shown:

 

**Example 1:**

**Input:** numRows = 5
**Output:** [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
**Example 2:**

**Input:** numRows = 1
**Output:** [[1]]

 

**Constraints:**

	- `1 <= numRows <= 30`

## Solutions

```Java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows == 0){
            return result;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(numRows == 1){
            return result;
        }

        for(int i=1; i<numRows; i++){
            List<Integer> prevRow = result.get(i-1);

            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=0; j<i-1; j++){
                row.add(prevRow.get(j) + prevRow.get(j+1));
            }
            row.add(1);
            result.add(row);
        }

        return result;
    }
}
```
