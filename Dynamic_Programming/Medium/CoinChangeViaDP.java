/*
322. Coin Change
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money. Return the fewest number of coins that you need to make up that amount.
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1.
*/
package day5;

import java.util.Arrays;

public class CoinChangeViaDP {
    public static int denom(int[] coins, int amt){
        int size = amt+1;
        int[] dp = new int[size];
        Arrays.fill(dp, size);
        dp[0]=0;
        for(int coin:coins)
            for(int index = coin;index<=amt;index++)
                dp[index] = Math.min(dp[index],
                    dp[index-coin]+1);
        if(dp[amt]<size) return dp[amt];
        else return -1;
    }
    public static void main(String[] args) {
        int coins[] = {1,2,5}, req = 11;
        // int coins[] = {2}, req = 3;
        System.out.println(denom(coins, req)   );
    }
}
