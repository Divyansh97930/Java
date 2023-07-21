public class InterviewQuest {
    //Stock Buy and Sell
    public static int buySell(int prices[]){
        int bp = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
           if(bp < prices[i]){
               int profit = prices[i] - bp;
               maxprofit = Math.max(profit, maxprofit);
           }
           else{
               bp = prices[i];
           }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buySell(prices));
    }
}
