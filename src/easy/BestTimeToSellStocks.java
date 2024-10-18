package easy;

public class BestTimeToSellStocks {
    public static void main(String[] args) {

        System.out.println(maxProfitBetterSolution(new int[] {7,1,5,3,6,4}));

    }

    public static int maxProfit(int[] prices) {

        int profit = 0;
        int cheap = Integer.MAX_VALUE;

        for(int i=1;i<prices.length-1;i++)
        {
            if(prices[i]<cheap)
            {
                cheap = prices[i];
            }
            if(prices[i+1]-cheap>profit)
            {
                profit = prices[i+1]-cheap;
            }
        }
        return profit;
    }

    public static int maxProfitBetterSolution(int[] prices) {

        int profit = 0;
        int cheap = prices[0];

        for(int i=1;i<prices.length-1;i++)
        {
            cheap = Math.min(prices[i],cheap);
            profit = Math.max(profit,prices[i]-cheap);
        }
        return profit;
    }
}
