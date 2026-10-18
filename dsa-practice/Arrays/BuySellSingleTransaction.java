public class BuySellSingleTransaction {
    static int maxProfit(int []prices){
        int max =0;
        for(int i =0;i<prices.length-1; i++){
            for(int j=i+1;j<prices.length;j++){
                int price = prices[j]-prices[i];
                if(price>max){ max=price;}
            }}
        return max;
    }


    static int maxProfitOptimal(int []prices){
        int maxProfit=0;
        int min = prices[0];
        for(int i =0; i<prices.length; i++){
            if(prices[i]-min>maxProfit){maxProfit=prices[i]-min; }
            if(prices[i]<min){min=prices[i];}}
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));
        System.out.println("Maximum Profit: " + maxProfitOptimal(prices));
    }
}
