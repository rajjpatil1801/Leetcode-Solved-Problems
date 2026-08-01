class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int left=0,n=arr.length,sum=0,min = Integer.MAX_VALUE;
        
        for(int right=0;right<n;right++){
            sum += arr[right];
            while(sum>=target){
                if(right-left+1<min) min = right-left+1;
                sum -= arr[left++];
                
            }
            
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}