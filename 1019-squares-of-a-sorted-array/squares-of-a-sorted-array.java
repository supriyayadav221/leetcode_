class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int k = nums.length - 1;
        int ans[] = new int[k+1];
        while(left <= right){
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                ans[k--] = nums[right] * nums[right];
                right--;
            } else {
                ans[k--] = nums[left] * nums[left];
                left++;
            }
        }
        return ans;
    }
}