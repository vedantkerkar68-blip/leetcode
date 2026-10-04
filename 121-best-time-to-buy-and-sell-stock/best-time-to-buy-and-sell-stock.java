class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        
        int buy = 0; 
        int profit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[buy] < prices[i]) {
                int current_profit = prices[i] - prices[buy];
                profit = Math.max(profit, current_profit);
            } else {
                buy = i;
            }
        }
        
        return profit;
    }
}
