package Day_6.StockBuySell;

public class StockBuySell {
    public static int maxProfit(int[]prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price :prices){
            if(price<minPrice){
                minPrice=price;
            }else if (price-minPrice>maxProfit){
                maxProfit=price-minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[]prices1={100,180,260,310,40,535,695};
        System.out.println("Maximum profit " +maxProfit(prices1));
        int[]prices2={4,2,2,2,4};
        System.out.println("maximum profit " +maxProfit(prices2));

    }
}
