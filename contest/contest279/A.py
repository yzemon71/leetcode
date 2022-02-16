from typing import List
class Solution:
    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        odd = []
        even = []
        for i, num in enumerate(nums):
            if i % 2 == 0: 
                even.append(num)
            else:
                odd.append(num)
        # sort
        even = sorted(even)
        odd = sorted(odd, reverse=True)
        # comp
        ans = [None] * (len(even)+len(odd))
        ans[::2] = even
        ans[1::2] = odd
        return ans

if __name__ == "__main__":
    s = Solution()
    nums = [2,1,4,3]
    print(s.sortEvenOdd(nums))