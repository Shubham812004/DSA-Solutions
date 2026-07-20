# Isomorphic Strings

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-isomorphic-strings` |
| Topics | Hash Table, String |
| Solved | 2026-07-20 |
| Runtime | 24 ms (beats 22.332000000000015%) |
| Memory | 43.7 MB (beats 47.337700000000034%) |

## Problem Statement

Given two strings `s` and `t`, _determine if they are isomorphic_.

Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

**Example 1:**

**Input:** s = "egg", t = "add"

**Output:** true

**Explanation:**

The strings `s` and `t` can be made identical by:

	- Mapping `'e'` to `'a'`.

	- Mapping `'g'` to `'d'`.

**Example 2:**

**Input:** s = "f11", t = "b23"

**Output:** false

**Explanation:**

The strings `s` and `t` can not be made identical as `'1'` needs to be mapped to both `'2'` and `'3'`.

**Example 3:**

**Input:** s = "paper", t = "title"

**Output:** true

 

**Constraints:**

	- `1 <= s.length <= 5 * 104`

	- `t.length == s.length`

	- `s` and `t` consist of any valid ascii character.

## Solutions

```Java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();;
        for(int i=0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(mapST.containsKey(ch1) && mapST.get(ch1) != ch2){
                return false;
            }
            if(mapTS.containsKey(ch2) && mapTS.get(ch2) != ch1){
                return false;
            }
            mapST.put(ch1, ch2);
            mapTS.put(ch2, ch1);
        }
        return true;
    }
}
```
