/*
290. Word Pattern
Given a pattern and a string s, find if s follows the same pattern.
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Explanation: Words correspond to pattern characters accurately.
*/
﻿import java.util.HashMap;
import java.util.Map;
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (!charToWord.containsKey(c)) {
                if (wordToChar.containsKey(w)) return false;
                charToWord.put(c, w);
                wordToChar.put(w, c);
            } else {
                if (!charToWord.get(c).equals(w)) return false;
            }
        }
        return true;
    }
}
