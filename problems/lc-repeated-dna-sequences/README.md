# Repeated DNA Sequences

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-repeated-dna-sequences` |
| Topics | Hash Table, String, Bit Manipulation, Sliding Window, Rolling Hash, Hash Function, Z Algorithm, Boyer–moore String Search Algorithm |
| Solved | 2026-11-19 |
| Runtime | 529 ms (beats 27.999499999999472%) |
| Memory | 274.8 MB (beats 11.970099999998842%) |

## Problem Statement

The **DNA sequence** is composed of a series of nucleotides abbreviated as `'A'`, `'C'`, `'G'`, and `'T'`.

	- For example, `"ACGAATTCCG"` is a **DNA sequence**.

When studying **DNA**, it is useful to identify repeated sequences within the DNA.

Given a string `s` that represents a **DNA sequence**, return all the **`10`-letter-long** sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in **any order**.

 

**Example 1:**

**Input:** s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
**Output:** ["AAAAACCCCC","CCCCCAAAAA"]
**Example 2:**

**Input:** s = "AAAAAAAAAAAAA"
**Output:** ["AAAAAAAAAA"]

 

**Constraints:**

	- `1 <= s.length <= 105`

	- `s[i]` is either `'A'`, `'C'`, `'G'`, or `'T'`.

## Solutions

```Java
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        int l = 0;
        int r = 9;
        while(r < s.length()){
            String dna = s.substring(l, r+1);
            map.put(dna, map.getOrDefault(dna, 0)+1);
            l++;
            r++;
        }
        List<String> res = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int val = entry.getValue();
            if(val > 1){
                res.add(key);
            }
        }
        return res;
    }
}
```
