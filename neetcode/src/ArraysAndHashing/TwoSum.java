package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) throws Exception {
        int[] temp = new TwoSum.Solution().twoSum(new int[]{3,4,5,6,},7);
        for(int val : temp){
            System.out.print(val+" ");
        }
        System.out.println();
        temp =new TwoSum.Solution().twoSum(new int[]{4,5,6,},10);
        for(int val : temp){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    static class Solution{
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> valToIndexMap = new HashMap<>();
            for(int i =0; i < nums.length; i++){
                valToIndexMap.put(nums[i], i);
            }

            for(int i =0; i < nums.length; i++){
                int diff = target - nums[i];
                if(valToIndexMap.containsKey(diff) && valToIndexMap.get(diff) != i){
                    return new int[]{i, valToIndexMap.get(diff)};
                }
            }
            return new int[0];
        }
    }
}
