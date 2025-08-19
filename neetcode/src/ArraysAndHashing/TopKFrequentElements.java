package ArraysAndHashing;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{1,2,3,4,3,3,4};
        System.out.println(new TopKFrequentElements.Solution().topKFrequent(nums, 2));
        nums = new int[]{1,1,1,2,2,6,6,3,4};
        System.out.println(new TopKFrequentElements.Solution().topKFrequent(nums,3));
    }

    static class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();

            for(int num : nums){//build list
                map.put(num, map.getOrDefault(num, 0)+1);
            }


            Comparator<int[]> comparator = (a,b) -> b[0]-a[0]; //used to create max heap
            PriorityQueue<int[]> heap = new PriorityQueue<>(comparator);
            for(Integer key : map.keySet()){
                int[] temp = new int[]{map.get(key), key};
                heap.offer(temp);
            }

            int[] answer = new int[k];
            for(int i = 0; i < k; i++){
                answer[i] = heap.poll()[1]; //get the number from the heap, not the count
            }
            return answer;
        }
    }
}
