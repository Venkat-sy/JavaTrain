/*
724. Find Pivot Index
Given an array of integers nums, calculate the pivot index of this array. The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation: The pivot index is 3. Left sum = 1 + 7 + 3 = 11. Right sum = 5 + 6 = 11.
*/
package day3;

import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        // int[] alpha = {1,7,3,6,5,6};
        int[] alpha = {2,1,-1};
        int preSum = 0, postSum = 0, size = alpha.length;
        for(int index = 0; index<size; index++){
            int[] subArray = Arrays.copyOfRange(alpha,index+1,size);
            postSum = Arrays.stream(subArray).sum();
            if(preSum == postSum){
                System.out.println(index);
                break;
            }
            preSum += alpha[index];
        }
    } 
}
