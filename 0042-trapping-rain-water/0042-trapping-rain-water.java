class Solution {
    public int trap(int[] height) {
        
        int n=height.length,left=0,right=n-1,leftMax=height[0],rightMax=height[n-1],water=0;
        while(left<right){
            if(leftMax<rightMax){
                left++;
                if(height[left]>leftMax) leftMax = height[left];
                water += leftMax - height[left];
            }
            else {
                right--;
                if(height[right]>rightMax) rightMax = height[right];
                water += rightMax - height[right];
            }
        }
        return water;

    }
}