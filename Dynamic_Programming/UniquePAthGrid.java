/*
62. Unique Paths
There is a robot on an m x n grid. The robot is initially located at the top-left corner. The robot can only move either down or right at any point in time. Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
Input: m = 3, n = 7
Output: 28
Explanation: Using DP, calculates the number of ways to reach bottom right corner.
*/
package day6;

public class UniquePAthGrid {
    public static int findPath(int row, int col){
        int[][] grid = new int[row][col];
        for(int left=0;left<row;left++) grid[left][0]=1;
        for(int right=0;right<col;right++)grid[0][right]=1;
        for(int left=1;left<row;left++){
            for(int right=1;right<col;right++)
                grid[left][right] = 
            grid[left-1][right]+grid[left][right-1];
        }
        return grid[row-1][col-1];
    }
    public static void main(String[] args) {
        int row=3, col=7;
        System.out.println(findPath(row, col));
        row=2; col=3;
        System.out.println(findPath(row, col));
        row=2; col=4;
        System.out.println(findPath(row, col));
    }
}
