class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }

        if(set.size() < nums.length)
            return true;
        return false;
    }
}