class Solution {
    public int findDuplicate(int[] nums) {
            for(int n : nums){
                int idx = Math.abs(n);
                System.out.println(idx);
                if(nums[idx] < 0)
                    return idx;
                nums[idx] = -nums[idx];
            }
            return -1;
    }
}