/*
70. Climbing Stairs
You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top: 1 step + 1 step, or 2 steps.
*/
package day3;

public class ClimbingStairs {
    public static int climb(int stairs){
        if(stairs<=1) return 1;
        else if(stairs==2) return 2;
        else return climb(stairs-1)+climb(stairs-2);
    }
    public static void main(String[] args) {
        System.out.println(climb(5));
        System.out.println(climb(4));
        System.out.println(climb(2));
    }
}
