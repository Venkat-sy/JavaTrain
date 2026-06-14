/*
Array Left Rotation
A left rotation operation on an array shifts each of the array's elements 1 unit to the left. Given an array a of n integers and a number, d, perform d left rotations on the array.
Input: a = [1, 2, 3, 4, 5], d = 4
Output: [5, 1, 2, 3, 4]
Explanation: When we perform 4 left rotations, the array undergoes the following sequence of changes: [1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]
*/
﻿import java.util.List;
import java.util.ArrayList;
public class ArrayLeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int n = a.size();
        List<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(a.get((i + d) % n));
        }
        return result;
    }
}
