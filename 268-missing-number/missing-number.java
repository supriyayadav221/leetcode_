class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum_of_n_numbers = (n * (n + 1) ) / 2;
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
        }
        return sum_of_n_numbers - sum;
}}