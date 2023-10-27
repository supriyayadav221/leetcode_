class Solution {
    public int longestConsecutive(int[] nums) {
        int count  = 1;
        int max = 0;
        Arrays.sort(nums);
        if(nums.length == 0)
        return 0;

        for(int i  =  0; i< nums.length-1; i++) {
if(nums[i]!=nums[i+1]){
   if(nums[i+1] - nums[i] <= 1) {
                count ++;

                continue;
            }
            max = Math.max(count, max);

            count = 1;
}
         
            
        }
        return Math.max(max,count);
    }
}