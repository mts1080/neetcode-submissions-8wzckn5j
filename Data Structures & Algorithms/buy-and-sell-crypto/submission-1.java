class Solution {
    public int maxProfit(int[] prices) {
        int lw = 0;
        int profit = 0;

        while (lw < prices.length) {
            int currMin = 1000;
            int currMax = 0;
            if (lw >= prices.length - 1) {
                break;
            }

            int rw = lw+1;
            while (rw < prices.length) {
                if (prices[rw] < prices[lw]) {
                    break;
                } else if (prices[rw] > prices[lw]) {
                    if (prices[lw] < currMin) {
                        currMin = prices[lw];
                    }
                    if (prices[rw] > currMax) {
                        currMax = prices[rw];
                    }
                    int tempProf = currMax - currMin;
                    if (tempProf > profit) {
                        profit = tempProf;
                    }
                    rw++;
                } else {
                    rw++;
                }
            }
            lw = rw;
        }

        return profit;
    }
}
