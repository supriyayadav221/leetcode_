class Solution {
   public int[] productExceptSelf(int[] nums) {

       int left[] = new int[nums.length];
       left[0] = 1;
       int right[] = new int[nums.length];
       right[nums.length - 1] = 1;
       int lProd = 1, rProd = 1;
       for(int i = 1 ; i< nums.length; i++){
           lProd *= nums[i-1];
           left[i] = lProd;
       }
        for(int i = nums.length - 2 ; i >= 0; i--){
           rProd = nums[i+1] * rProd;
           right[i] = rProd;

       }
       for(int i = 0 ; i< nums.length; i++){
         nums[i] = left[i] * right[i];
       }
return nums;
       
   }

}