/*
121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
*/
package day1;

public class BestTimeBuySell {
    public static void main(String[] args) {
        // int[] stocks = {7,1,5,3,6,4};
        int[] stocks = {90,40,20,10,4};
        if(stocks.length<2) return;
        int cBuy = stocks[0], cSell = stocks[1];
        int mPro = cSell - cBuy;
        for(int curr=1;curr<stocks.length;curr++){
            int cPro = stocks[curr] - cBuy;
            if(cPro>mPro){
                mPro = cPro;
                cSell = stocks[curr];
            }
            if(stocks[curr]<cBuy) cBuy = stocks[curr];
        }
        System.out.println((cSell-mPro)+" "+cSell);
    }
}
