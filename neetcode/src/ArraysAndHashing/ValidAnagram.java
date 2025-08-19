import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) throws Exception {
        System.out.println(new Solution().isAnagram("racecar","carrace"));
        System.out.println(new Solution().isAnagram("racbecar","carrace"));
    }

    static class Solution{
        public boolean isAnagram(String s, String t) {
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            return Arrays.equals(sArray,tArray);
        }
    }
}

