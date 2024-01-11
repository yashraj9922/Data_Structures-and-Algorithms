package PS;

public class richCustomer {
    // 1672. Richest Customer Wealth
    // leetcode: https://leetcode.com/problems/richest-customer-wealth/

    class Solution {
        public int maximumWealth(int[][] accounts) {
            int maxSalary = 0;
            for (int i = 0; i < accounts.length; i++) {
                int tempSalary = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    tempSalary += accounts[i][j];
                }
                maxSalary = Math.max(maxSalary, tempSalary);
            }
            return maxSalary;
        }
    }
}
