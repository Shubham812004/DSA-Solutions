# Allocate Minimum Pages

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-allocate-minimum-number-of-pages0937` |
| Topics | Searching, Divide and Conquer |
| Solved | 2026-10-14 |
| Solve Time | 31m 25s |

## Solutions

```Java
class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(k > arr.length) return -1;
        long l = Arrays.stream(arr).max().getAsInt();
        long h = 0;
        for(int num : arr){
            h += num;
        }
        long ans = -1;
        while(l <= h){
            long m = l + (h - l)/2;
            if(helper(arr, k, m)){
                ans = m;
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return (int)ans;
    }
    
    public boolean helper(int[] arr, int k, long m){
        int count = 1;
        long sum = 0;
        for(int pages : arr){
            if(sum + pages <= m){
                sum += pages;
            }else{
                count++;
                sum = pages;
            }
        }
        return count <= k;
    }
}
```
