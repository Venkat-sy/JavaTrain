/*
Sliding Window Minimum
You are given an array of integers nums, there is a sliding window of size k. Return the min sliding window.
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [-1, -3, -3, -3, 3, 3]
Explanation: Slide the window of size 3 and find the minimum at each step.
*/
package day7;

import java.util.Arrays;
import java.util.Hashtable;

public class SlidingWindowMinimum {
    public static String[] window(String[] c, String[] r){
        Hashtable<String,Integer> rTab=new Hashtable<>();
        Hashtable<String,Integer> cTab=new Hashtable<>();
        int mStart=0, start=0,end=0,mLen=Integer.MAX_VALUE;
        int count=0;
        for(String each:r)
            rTab.put(each, rTab.getOrDefault(each, 0)+1);
        while(end<c.length){
            cTab.put(c[end], cTab.getOrDefault(c[end], 0)+1);
            if(rTab.containsKey(c[end])) count++;
            while(count==rTab.size()){
                if(mLen>(end-start+1)){
                    mLen = end-start+1;
                    mStart=start;
                }
                String exists = c[start];
                if(cTab.containsKey(exists)){
                    cTab.put(exists, cTab.get(exists)-1);
                    if(cTab.get(exists)<rTab.getOrDefault(exists, 0))
                        count--;
                }
                start++;
            }
            end++;
        }
        if(mLen==Integer.MAX_VALUE) return new String[]{};
        return Arrays.copyOfRange(c, mStart, mStart+mLen);
    }
    public static void main(String[] args) {
        String[] cur={"b","s","a","c","f"};
        String[] req={"s","c"};
        String[] result = window(cur, req);
        System.out.println(Arrays.toString(result));
    }
}
