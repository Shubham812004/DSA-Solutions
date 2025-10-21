class Solution(object):
    def lengthOfLongestSubstring(self, s):
        n = len(s)
        result = 0
        for i in range(n):
            seen = set()
            for j in range(i,n):
                if s[j] in seen:
                    break
                else:
                    seen.add(s[j])
                    result = max(result, j-i+1)
        return result
        