/*
2942. Find Words Containing Character
You are given a 0-indexed array of strings words and a character x. Return an array of indices representing the words that contain the character x.
Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
*/
package day9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindCharInList {
    public static void main(String[] args) {
        String[] words = {"leet","code"}; char x = 'e';
        // for(int index=0;index<words.length;index++){
        //     if(words[index].contains(String.valueOf(x)))
        //         System.out.print(index);
        // }
        List<Integer> collected = IntStream.range
        (0, words.length).
        filter(index->words[index].indexOf(x)!=-1).boxed().
        collect(Collectors.toList());
        System.out.println(collected);
    }
}
