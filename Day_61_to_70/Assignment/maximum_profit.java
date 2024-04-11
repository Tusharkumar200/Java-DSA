public class maximum_profit {
  
  public static int stock(int[] prices){
   int buyPrice = Integer.MAX_VALUE;
   int maxProfit = 0;
   
   for (int i = 0; i < prices.length; i++) {
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
    int prices[] = {7, 1, 5, 3, 6, 4};
    stock(prices);
  }
}
