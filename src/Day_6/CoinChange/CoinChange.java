package Day_6.CoinChange;

public class CoinChange {
    public static int countWays(int sum, int[]coins){
        int[]dp=new int[sum+1];
        dp[0]=1;
        for(int coin: coins){
            for (int i= coin;i<=sum;i++){
                dp[i]+=dp[i-coin];
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        int sum=4;
        int[]coins={1,2,3};
        int ways= countWays(sum,coins);
        System.out.println("Number of ways to make sum" +sum +" : " +ways);
    }

}
