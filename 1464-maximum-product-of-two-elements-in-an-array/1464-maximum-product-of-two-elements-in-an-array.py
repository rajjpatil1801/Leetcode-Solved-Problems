class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxx = 0
        sec_max = nums[0]
        for i in range(len(nums)):
            if(nums[i]>maxx):
                sec_max = maxx
                maxx = nums[i]
            elif(nums[i]>sec_max):
                sec_max = nums[i]
        return (maxx-1)*(sec_max-1)

                
            