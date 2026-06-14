/*
153. Find Minimum in Rotated Sorted Array
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. Given the sorted rotated array nums of unique elements, return the minimum element of this array.
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
*/
package day4;

public class MinInRotSortedArray {
    public static void main(String[] args) {
        // int[] arr = {3,4,5,1,2};
        int[] arr = {11,12,13,14};
        int left = 0, right = arr.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]>arr[right]) left=mid+1;
            else right = mid;
        }
        System.out.println(arr[left]);
    }
}
