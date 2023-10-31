class Solution {
    public double findMaxAverage(int[] nums, int k) {



        int max_avg = 0;
        int max_sum = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            max_sum += nums[i];
        }
        sum = max_sum;
       
       
        for(int i = k; i< nums.length; i++){
            sum +=  nums[i] - nums[i-k];

            max_sum = Math.max(sum,max_sum);
        }
        return (double)max_sum / k;
    }
}