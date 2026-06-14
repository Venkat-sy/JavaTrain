/*
853. Car Fleet
There are n cars going to the same destination along a one-lane road. The destination is target miles away. You are given two integer array position and speed. Return the number of car fleets that will arrive at the destination.
Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
Output: 3
Explanation: The cars starting at 10 and 8 form a fleet, 5 and 3 form a fleet, and 0 forms a fleet.
*/
package day13;

import java.util.Comparator;
import java.util.TreeMap;

public class CarFleet {
    public static int count(int[] pos, int[] sp, int tar){
        int size=pos.length, fCount=0;
        TreeMap<Integer,Double> tab = 
            new TreeMap<>(Comparator.reverseOrder());
        for(int ind=0;ind<size;ind++){
            tab.put(pos[ind], 
                (double)(tar - pos[ind])/sp[ind]
            );
        }
        double time=0.0;
        for(double curTime:tab.values()){
            if(time<curTime){
                fCount++;
                time=curTime;
            }
        }
        return fCount;
    }
    public static void main(String[] args) {;
        int[] pos={10,8,0,5,3};
        int[] sp={2,4,1,1,3};
        int target=12;
        System.out.println(count(pos, sp, target));
    }
}
