/*
239. Sliding Window Maximum
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. Return the max sliding window.
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: Slide the window of size 3 and find the maximum at each step.
*/
package day6;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public static int[] traverse(int[] arr, int win){
        if(arr.length==0) return new int[0];
        int size = arr.length, index = 0;
        int[] res = new int[size-win+1];
        Deque<Integer> dq = new LinkedList<>();
        while(index<size){
            while(!dq.isEmpty()&&dq.peekFirst()<=index-win)
                dq.pollFirst();
            while(!dq.isEmpty()&&arr[dq.peekLast()]<arr[index])
                dq.pollLast();
            dq.offer(index);
            if(index>=win-1) res[index-win+1]=arr[dq.peekFirst()];
            index++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int[] got = traverse(arr, 3);
        System.out.println(Arrays.toString(got));
    }
}
