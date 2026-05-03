# Sum of Primes Between Number and Its Reverse

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-sum-of-primes-between-number-and-its-reverse` |
| Topics | Math, Number Theory |
| Solved | 2026-05-03 |
| Runtime | 4 ms (beats 81.58290000000001%) |
| Memory | 42.6 MB (beats 68.64540000000001%) |

## Problem Statement

You are given an integer `n`.

Let `r` be the integer formed by reversing the digits of `n`.

Return the **sum** of all prime numbers between `min(n, r)` and `max(n, r)`, inclusive.

 

**Example 1:**

**Input:** n = 13

**Output:** 132

**Explanation:**

	- The reverse of 13 is 31. Thus, the range is `[13, 31]`.

	- The prime numbers in this range are 13, 17, 19, 23, 29, and 31.

	- The sum of these prime numbers is `13 + 17 + 19 + 23 + 29 + 31 = 132`.

**Example 2:**

**Input:** n = 10

**Output:** 17

**Explanation:**

	- The reverse of 10 is 1. Thus, the range is `[1, 10]`.

	- The prime numbers in this range are 2, 3, 5, and 7.

	- The sum of these prime numbers is `2 + 3 + 5 + 7 = 17`.

**Example 3:**

**Input:** n = 8

**Output:** 0

**Explanation:**

	- The reverse of 8 is 8. Thus, the range is `[8, 8]`.

	- There are no prime numbers in this range, so the sum is 0.

 

**Constraints:**

	- `1 <= n <= 1000`

## Hints

<details>
<summary>Hint 1</summary>

Simulate as described

</details>

## Solutions

```Java
class Solution {
    public int reverseNumber(int n){
        int revNum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n/10;
        }
        return revNum;
    }

    public boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num % i==0) return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int sum = 0;
        int r = reverseNumber(n);
        int start = Math.min(n,r);
        int end = Math.max(n,r);
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
}
```
