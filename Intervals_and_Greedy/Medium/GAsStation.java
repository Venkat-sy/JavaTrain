/*
134. Gas Station
There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i]. You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station.
Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Output: 3
Explanation: Start at station 3 (index 3) and fill up with 4 unit of gas. You can travel around the circuit.
*/
package day13;

public class GAsStation {
    public static int circle(int[] gas, int[] cost){
        int tTank=0, cTank=0, sStation=0;
        for(int index=0;index<gas.length;index++){
            tTank += gas[index] - cost[index];
            cTank += gas[index] - cost[index];
            if(cTank<0){sStation = index+1;cTank = 0;}
        }
        if(tTank>=0) return sStation;
        else return -1;
    }
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(circle(gas, cost));
    }
}
