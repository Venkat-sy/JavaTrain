/*
169. Majority Element
Given an array nums of size n, return the majority element. The majority element is the element that appears more than floor(n / 2) times.
Input: nums = [3,2,3]
Output: 3
Explanation: 3 occurs twice, which is more than 3/2 = 1 times.
*/
﻿public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
