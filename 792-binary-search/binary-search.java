class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length - 1  ,target);
    }

    public int bs(int[] nums, int left, int right, int target){
        int mid = (left +  right)  /2 ;
        System.out.print(mid);
        if(left > right)
        return -1;
        if(nums[mid] == target){
            return mid;
        } else if(target < nums[mid]){
           return bs(nums,left, mid -1 , target);
        } else if(target > nums[mid]){
          return  bs(nums,mid + 1, right, target);
        }
        return -1;
    }
}