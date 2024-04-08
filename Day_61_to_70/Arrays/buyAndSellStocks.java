public class buyAndSellStocks {
  // Time complexity --> O(n)
  public static int stocks(int prices[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if(buyPrice < prices[i]){   //profit
        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(maxProfit,profit);
      }
      else{
        buyPrice = prices[i];
      }
    }
      return maxProfit;
  }
  public static void main(String[] args) {
    int prices[] = {7,1,5,3,6,4};
    int result = stocks(prices);
    System.out.println(" profit stock price : "+result);
  }
}
