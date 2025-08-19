package Trees;

import java.util.Arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        
        while(left <= right){ //within unchecked bounds...
            int middle = left + ((right - left)/2);
            if(nums[middle] > target){ //look left
                right = middle - 1;
            } else if(nums[middle] < target){ //look left
                left = middle +1;
            }else {
                return middle;
            }
            

        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if(index >=0){
            return index;
        }else{
            return -1;
        }
    }

}

