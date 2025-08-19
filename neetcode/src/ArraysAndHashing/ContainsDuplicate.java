package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{1,2,3,4,3};
        System.out.println(new Solution().hasDuplicate(nums));
        nums = new int[]{1,2,3,4};
        System.out.println(new Solution().hasDuplicate(nums));
    }

    static class Solution {
        public boolean hasDuplicate(int[] nums) {
            Set<Integer> uniqueSet = new HashSet<Integer>();
            for(int num : nums){
                if(uniqueSet.contains(num)){
                    return true;
                }else{
                    uniqueSet.add(num);
                }
            }
            return false;
        }
    }
}


