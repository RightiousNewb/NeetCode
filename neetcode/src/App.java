import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{1,2,3,4,3};
        System.out.println(new Solution().hasDuplicate(nums));
    }
}

class Solution {
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
