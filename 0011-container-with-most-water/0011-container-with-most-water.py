class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxi = 0
        n = len(height)
        left = 0
        right = n-1
        while(left<right):
            width = right - left
            length = min(height[left],height[right])
            area = length*width
            if(area>maxi): maxi=area
            if(height[left]<height[right]):
                left+=1
            else:
                right-=1
        return maxi
