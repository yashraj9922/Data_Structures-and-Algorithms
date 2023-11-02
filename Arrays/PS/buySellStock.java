package PS;

// Leetcode 121 - Best Time to Buy and Sell Stock

class Solution1 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];

            profit = prices[i] - min;
            if (profit > maxProfit)
                maxProfit = profit;
        }
        return maxProfit;
    }
}

public class buySellStock {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(s.maxProfit(prices));
    }
}