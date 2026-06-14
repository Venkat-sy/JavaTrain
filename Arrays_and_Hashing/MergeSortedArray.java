/*
88. Merge Sorted Array
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively. Merge nums1 and nums2 into a single array sorted in non-decreasing order.
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6]. The result of the merge is [1,2,2,3,5,6] inside nums1.
*/
package day4;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] alpha = {1,4,6,0,0};
        int m = 3, n =2;
        int[] beta = {2,5};
        int left = m-1, right = n-1, pos = m+n-1;
        while(left>=0&&right>=0){
            if(alpha[left]>beta[right])
                alpha[pos--] = alpha[left--];
            else alpha[pos--] = beta[right--];
        }
        while(right>=0)alpha[pos--] = beta[right--];
        System.out.println(Arrays.toString(alpha));
    }
}
