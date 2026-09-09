class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1; 
        int max = 0;
        while (r < prices.length) {
            int profit = 0;
            if (prices[r] - prices[l] < 0) {
                l = r;
            } else {
                profit = prices[r] - prices[l];
            }
            if (profit > max) {
                max = profit;
            }
            ++r;
        }
        return max;
    }
}
