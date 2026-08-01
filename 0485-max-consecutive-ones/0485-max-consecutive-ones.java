class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length,cnt=0,maxcnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1) cnt++;
            if(maxcnt<cnt) maxcnt = cnt;
            if(nums[i]==0) cnt=0;
             
        }
        return maxcnt;
    }
}