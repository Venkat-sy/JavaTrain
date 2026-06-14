/*
888. Fair Candy Swap
Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has. Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy.
Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]
Explanation: Alice gives 1 candy to Bob, Bob gives 2 candies to Alice. Both end up with 3 candies total.
*/
﻿import java.util.HashSet;
import java.util.Set;
public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        Set<Integer> setB = new HashSet<>();
        for (int x : aliceSizes) sumA += x;
        for (int x : bobSizes) { sumB += x; setB.add(x); }
        int delta = (sumB - sumA) / 2;
        for (int x : aliceSizes) {
            if (setB.contains(x + delta)) {
                return new int[]{x, x + delta};
            }
        }
        return new int[0];
    }
}
