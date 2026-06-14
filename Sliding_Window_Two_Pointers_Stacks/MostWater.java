/*
11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together with the x-axis form a container, such that the container contains the most water.
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
*/
package day13;

public class MostWater {
    public static int maxCount(int[] arr){
        int left=0, right=arr.length-1, mArea=0, tArea;
        while(left<right){
            int wid = right-left;
            tArea = Math.min(arr[left], arr[right])*wid;
            mArea = Math.max(mArea, tArea);
            if(arr[left]<arr[right]) left++;
            else right--;
        }
        return mArea;
    }
    public static void main(String[] args) {
        int[] cont = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxCount(cont));
    }
}
