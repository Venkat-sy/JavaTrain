/*
326. Power of Three
Given an integer n, return true if it is a power of three. Otherwise, return false.
Input: n = 27
Output: true
Explanation: 27 = 3^3.
*/
﻿public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
