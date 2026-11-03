class Solution {
    public int minMoves(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += Math.abs(max-nums[i]);
        }
        return sum;
    }
}