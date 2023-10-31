class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer, Integer> ht1 = new HashMap<>();
         int max = 0;
         int res = 0;
         if(nums.length == 1)
            return nums[0];
         for(int x: nums){
             if(!ht1.containsKey(x)){
             ht1.put(x,1);
             }
             else {
                 int n = ht1.get(x)+1;
                 if(n > max){
                     max= n;
                    res = x;
                 }
                 ht1.put(x,n);
             }
         }
return res;
        

    }
}