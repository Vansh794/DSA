class Solution {
    public int pivotIndex(int[] nums) {
        int low=0;
        int high = nums.length-1;
        int totalSum =0;
        for(int num : nums){
            totalSum += num;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum = totalSum -leftSum-nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
        
    }
}