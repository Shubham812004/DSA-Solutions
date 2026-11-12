# Sort Characters By Frequency

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-sort-characters-by-frequency` |
| Topics | Hash Table, String, Sorting, Heap (Priority Queue), Bucket Sort, Counting |
| Solved | 2026-11-12 |
| Runtime | 12 ms (beats 85.8971%) |
| Memory | 45.8 MB (beats 97.50090000000003%) |

## Problem Statement

Given a string `s`, sort it in **decreasing order** based on the **frequency** of the characters. The **frequency** of a character is the number of times it appears in the string.

Return _the sorted string_. If there are multiple answers, return _any of them_.

 

**Example 1:**

**Input:** s = "tree"
**Output:** "eert"
**Explanation:** 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

**Example 2:**

**Input:** s = "cccaaa"
**Output:** "aaaccc"
**Explanation:** Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.

**Example 3:**

**Input:** s = "Aabb"
**Output:** "bbAa"
**Explanation:** "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.

 

**Constraints:**

	- `1 <= s.length <= 5 * 105`

	- `s` consists of uppercase and lowercase English letters and digits.

## Solutions

```Java
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(entry);
        }

        StringBuilder str = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> curr = pq.poll();
            char ch = curr.getKey();
            int freq = curr.getValue();
            while(freq > 0){
                str.append(ch);
                freq--;
            }
        }
        return str.toString();
    }
}
```
