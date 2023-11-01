class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int n : nums)
        {
            int idx = Math.abs(n);

            if(nums[idx - 1]<0)
            res.add(idx);
            nums[idx-1] = - nums[idx-1];
        }
        return res;
    }
}