class Solution(object):
    def groupAnagrams(self, strs):
        freq = {}
        for word in strs:
            sorted_word = ''.join(sorted(word))
            if sorted_word not in freq:
                freq[sorted_word] = []
            freq[sorted_word].append(word)
        return list(freq.values())