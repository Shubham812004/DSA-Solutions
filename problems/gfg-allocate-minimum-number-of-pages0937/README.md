# Allocate Minimum Pages

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-allocate-minimum-number-of-pages0937` |
| Topics | Searching, Divide and Conquer |
| Solved | 2026-10-14 |
| Solve Time | 31m 25s |

## Problem Statement

Given an array **arr[] **of integers, where each element **arr[i]** represents the number of pages in the i-th book. You also have an integer **k** representing the number of students. The task is to allocate books to each student such that:

- Each student receives atleast one book.

- Each student is assigned a contiguous sequence of books.

- No book is assigned to more than one student.

- All books must be allocated.

The objective is to minimize the maximum number of pages** **assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum. If it is not possible to allocate books to all students, return **-1**;

**Examples:**

**Input: **arr[] = [12, 34, 67, 90], k = 2
**Output: **113
**Explanation: **Allocation can be done in following ways:
=> [12] and [34, 67, 90] Maximum Pages = 191
=> [12, 34] and [67, 90] Maximum Pages = 157
=> [12, 34, 67] and [90] Maximum Pages = 113.
The third combination has the minimum pages assigned to a student which is 113.
**Input:** arr[] = [15, 17, 20], k = 5
**Output: **-1
**Explanation: **Since there are more students than total books, it's impossible to allocate a book to each student.

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
