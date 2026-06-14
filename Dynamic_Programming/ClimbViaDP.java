/*
70. Climbing Stairs (via DP)
You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top: 1+1+1, 1+2, 2+1.
*/
package day4;
public class ClimbViaDP {
    public static int dpClimb(int stairs){
        if(stairs<0) return 1;
        else if(stairs<=2) return stairs;
        int[] dp = new int[stairs+1];
        dp[0]=0;dp[1]=1;dp[2]=2;
        for(int index=3;index<=stairs;index++){
            dp[index] = dp[index-1]+dp[index-2];
        }
        return dp[stairs];
    }
    public static void main(String[] args) {
        System.out.println(dpClimb(8));
        System.out.println(dpClimb(-1));
        System.out.println(dpClimb(5));
    }
}
