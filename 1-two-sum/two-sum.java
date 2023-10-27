import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       Hashtable<Integer, Integer> ht1 = new Hashtable<>();
       for(int i = 0; i< nums.length ; i++) {
           if(ht1.containsKey(target - nums[i]))
           {
               
               return new int[]{ht1.get(target-nums[i]),i};
           }
        ht1.put(nums[i],i);
       }
        return new int[]{};
    }
}