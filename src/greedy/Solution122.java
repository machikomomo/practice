package greedy;

class Solution122 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            sum = sum + Math.max(0, prices[i] - prices[i - 1]);
        }
        return sum;
    }
}
