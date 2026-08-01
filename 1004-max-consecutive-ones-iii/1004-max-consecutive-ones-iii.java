class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,zeros=0,maxLen=0,n=nums.length;
        while(right<n){
            if(nums[right]==0) zeros++;
            
            while(zeros>k){
                if(nums[left]==0) {zeros--;}
                left++;
            }
            maxLen = Math.max(right-left+1,maxLen);
            right++;
        }
        return maxLen;
    }
}