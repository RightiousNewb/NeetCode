package SlidingWindow;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/*
 * You are given a string s consisting of only uppercase english characters and an integer k. 
 * You can choose up to k characters of the string and replace them with any other uppercase English character.

After performing at most k replacements, 
return the length of the longest substring which contains only one distinct character.
 * 
 */
public class LongestRepeatingSubstringReplacement {
   
    public int characterReplacement(String s, int k){
        int left = 0;
        int maxFreq = 0;
        int longest = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        for(int right = 0; right < s.length();right++){
            freqMap.put(s.charAt(right), freqMap.getOrDefault(s.charAt(right),0) +1); //increments count
            maxFreq = Math.max(maxFreq, freqMap.get(s.charAt(right)));

            while( (right - left +1) - maxFreq > k){
                freqMap.put(s.charAt(left), freqMap.get(s.charAt(left))-1); //left char decrement as you shift
                left++; //shift left pointer to right
            }
            longest = Math.max(longest, (right-left+1));
        }
        return longest;

    }


public static void main(String[] args){
        System.out.println("Longest="+new LongestRepeatingSubstringReplacement().characterReplacement("AABABBA", 1));
    }

}