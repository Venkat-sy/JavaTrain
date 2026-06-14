/*
136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Input: nums = [2,2,1]
Output: 1
Explanation: 1 appears only once.
*/
﻿public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;
        }
        return result;
    }
}
