# Word Pattern

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-word-pattern` |
| Topics | Hash Table, String |
| Solved | 2026-11-19 |
| Runtime | 1 ms (beats 89.7453%) |
| Memory | 42.5 MB (beats 62.99440000000001%) |

## Problem Statement

Given a `pattern` and a string `s`, find if `s` follows the same pattern.

Here **follow** means a full match, such that there is a bijection between a letter in `pattern` and a **non-empty** word in `s`. Specifically:

	- Each letter in `pattern` maps to **exactly** one unique word in `s`.

	- Each unique word in `s` maps to **exactly** one letter in `pattern`.

	- No two letters map to the same word, and no two words map to the same letter.

 

**Example 1:**

**Input:** pattern = "abba", s = "dog cat cat dog"

**Output:** true

**Explanation:**

The bijection can be established as:

	- `'a'` maps to `"dog"`.

	- `'b'` maps to `"cat"`.

**Example 2:**

**Input:** pattern = "abba", s = "dog cat cat fish"

**Output:** false

**Example 3:**

**Input:** pattern = "aaaa", s = "dog cat cat dog"

**Output:** false

 

**Constraints:**

	- `1 <= pattern.length <= 300`

	- `pattern` contains only lower-case English letters.

	- `1 <= s.length <= 3000`

	- `s` contains only lowercase English letters and spaces `' '`.

	- `s` **does not contain** any leading or trailing spaces.

	- All the words in `s` are separated by a **single space**.

## Solutions

```Java
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(str.length != pattern.length()) return false;
        Map<Character, String> mapPS = new HashMap<>();
        Map<String, Character> mapSP = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = str[i];
            if(mapPS.containsKey(ch) && !mapPS.get(ch).equals(word)) return false;
            if(mapSP.containsKey(word) && ch != mapSP.get(word)) return false;
            mapPS.put(ch, word);
            mapSP.put(word, ch);
        }
        return true;
    }
}
```
