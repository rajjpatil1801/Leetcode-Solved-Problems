class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i=0,j=n-1,index=n-1,ans[] = new int[n];
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[index] = nums[i]*nums[i];
                i++;
            }
            else{
                ans[index] = nums[j]*nums[j];
                j--;
            }
            index--;
        }
        return ans;
    }
}