/*
283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Explanation: Non-zero elements 1,3,12 retain order and 0s are moved to end.
*/
package day1;

import java.util.Arrays;

public class MovingZero {
    public static void move(int[] trucks){
        int valid = 0, traversal = 0, size = trucks.length;
        while(traversal<size){
            if(trucks[traversal]!=0){
                trucks[valid]=trucks[traversal];
                valid++;
            }
            traversal++;
        }
        Arrays.fill(trucks, valid,size,0);
        System.out.println(Arrays.toString(trucks));
    }
    public static void main(String[] args) {
        move(new int[]{20,0,19,5,0,3,10,0,2});
        move(new int[]{3,0,0,1,0,5,0,6,0});
    }
}
