class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,zeros=0,maxLen=0,n=nums.length;
        for(int right=0;right<n;right++){
            if(nums[right]==0) zeros++;
            
            while(zeros>k){
                if(nums[left]==0) {zeros--;}
                left++;
            }
            maxLen = Math.max(right-left+1,maxLen);
        }
        return maxLen;
    }
}