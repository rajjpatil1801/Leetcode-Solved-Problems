class Solution {
    public int maxArea(int[] height) {
        int maxi = 0;
        int n = height.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {

            int width = right - left;
            int length = Math.min(height[left], height[right]);
            int area = length * width;

            if (area > maxi) {
                maxi = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxi;
    }
}