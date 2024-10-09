class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;

        // If there is only one price, return 0 as profit
        if (prices.length == 1){
            return profit;
        }

        // If there is only two elements, check to see if the first element is smaller
        if (prices.length == 2){
            // Return 0 as profit if first price is bigger, otherwise return difference as profit
            if (prices[0] > prices[1]){ return profit; }
            else { return prices[1]-prices[0]; }
        }

        else {

            // Set initial buying price as first element
            int buyPrice = prices[0];

            // Cycle through every element in prices
            for (int i=1; i<prices.length; i++) {

                // Check if current price is bigger than buying price
                if (prices[i] > buyPrice){
                    // If difference between current price and buy price is bigger than current profit, replace current profit amount with new difference
                    if ((prices[i] - buyPrice) > profit){
                        profit = prices[i] - buyPrice;
                    }
                }

                // Otherwise, if current price is smaller update buy price to current price
                else if (prices[i] < buyPrice){
                    buyPrice = prices[i];
                }
            }
            return profit;
        }
    }
}
