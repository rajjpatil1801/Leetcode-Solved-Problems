class Solution {
    public void sortColors(int[] arr) {
        int zero=0,one=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0) zero++;
            if(arr[i]==1) one++;
        }
        int j =0;
        for(int i=0;i<zero;i++) arr[j++]=0;
        for(int i=0;i<one;i++) arr[j++]=1;
        while(j<n) arr[j++] = 2;
    }
}