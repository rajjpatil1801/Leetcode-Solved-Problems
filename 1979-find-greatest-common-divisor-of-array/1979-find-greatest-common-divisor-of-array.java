class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[n-1],b = nums[0];
        return GCD(a,b);
    }
    public int GCD(int a,int b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
}