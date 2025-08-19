package SlidingWindow;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            longest = Math.max(longest, (right-left+1));
        }

        return longest;
    }

    public static void main(String[] args){
        new LongestUniqueSubstring().lengthOfLongestSubstring("abcabcbb");
    }

}
