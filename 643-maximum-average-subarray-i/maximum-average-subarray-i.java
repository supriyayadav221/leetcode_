class Solution {
    public double findMaxAverage(int[] nums, int k) {

       

        double sum = 0;
        double max_sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        max_sum = sum;


        for(int i = k; i< nums.length; i++){
            sum = sum +  nums[i] - nums[i-k];

            max_sum = Math.max(sum,max_sum);
        }
        return max_sum/k;
    }
}