// Time complexity - O(n)
// Space complexity - O(1)
// Works on leetcode

class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int price: prices){
            buy = Integer.min(buy, price);
            profit = Integer.max(profit, price - buy);
        }
        return profit;
    }
}
