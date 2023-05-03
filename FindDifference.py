class Solution(object):
    def findDifference(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[List[int]]
        """
        # Step 1: Find all distinct integers in nums1 that are not present in nums2.
        list1 = []
        for num in nums1:
            if num not in nums2 and num not in list1:
                list1.append(num)

        # Step 2: Find all distinct integers in nums2 that are not present in nums1.
        list2 = []
        for num in nums2:
            if num not in nums1 and num not in list2:
                list2.append(num)

        # Step 3: Return the result as a list of two lists.
        return [list1, list2]