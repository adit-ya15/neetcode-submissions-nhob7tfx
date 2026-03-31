class Solution {
    public int maxProfit(int[] prices) {
        int price = Integer.MAX_VALUE;
        int maxProfit  = 0;
        
        for(int i = 0;i<prices.length;i++){
            if(prices[i] < price){
                price = prices[i];
            }
            else if(prices[i] > price){
                int profit = prices[i] - price;
                maxProfit = Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}
