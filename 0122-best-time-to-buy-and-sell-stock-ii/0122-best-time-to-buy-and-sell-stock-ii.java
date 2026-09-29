class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0) return 0;
        int maxprofit = 0,buy = prices[0],mainprofit=0;
        for(int i=1;i<n;i++){
            int profit = prices[i]-buy;
            if(profit>maxprofit){
                maxprofit = prices[i]-buy;
            } 
            else if(buy>prices[i]){
                buy = prices[i];
            }
            if(i!=n-1){
                if(profit>prices[i+1]-buy){
                    buy = prices[i+1];
                    i+=1;
                    mainprofit += maxprofit;
                    maxprofit = 0;
                }
            }
        }
        mainprofit += maxprofit;

        
        return mainprofit;
    }
}