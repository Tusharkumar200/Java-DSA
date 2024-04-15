public class maximum_profit {
  // Time complexity --> O(n)
  public static int stock(int[] prices){
   int buyPrice = Integer.MAX_VALUE;
   int maxProfit = 0;
   
   for (int i = 0; i < prices.length-1; i++) {
      if(buyPrice < prices[i]){
        int Profit = prices[i];
        maxProfit = Math.max(maxProfit,Profit);

      }
      else{
        buyPrice = prices[i];
      }
   }
   return maxProfit;
  }
  public static void main(String[] args) {
    int prices[] = {7, 6, 4, 3, 1};
    int result = stock(prices);
    System.out.println(result);
  }
}
