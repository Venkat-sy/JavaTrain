/*
55. Jump Game
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position. Return true if you can reach the last index, or false otherwise.
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
*/
package day13;

public class JumpGame {
    public static boolean reached(int[] nums){
        int mLen = 0, index = 0, size = nums.length;
        while ((index<size)) {
            if(index>mLen) return false;
            mLen = Math.max(mLen, index+nums[index]);
            index++;
        }
        return true;
    }
    public static void main(String[] args) {
        // int[] nums = {2,3,1,1,4};
        int[] nums = {3,2,1,0,4};
        System.out.println(reached(nums));
    }
}
