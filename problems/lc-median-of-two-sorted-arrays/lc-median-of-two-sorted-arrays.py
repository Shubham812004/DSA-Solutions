class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        num = sorted(nums1 + nums2)
        lenght = len(num)
        mid = lenght//2
        return float(num[mid]
        if lenght % 2
        else (num[mid-1] + num[mid])/2.0)