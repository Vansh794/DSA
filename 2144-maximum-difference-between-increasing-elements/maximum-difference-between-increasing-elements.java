class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int diff = -1;
        int minvalue = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] >minvalue){
                diff = Math.max(Math.abs(minvalue - nums[i]),diff);
            }
            else{
                minvalue  = nums[i];
            }
        }
        return diff;
        
    }
}