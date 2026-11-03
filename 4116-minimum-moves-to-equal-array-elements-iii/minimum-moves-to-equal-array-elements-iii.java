class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1){
            return 0;
        }
        int ele = nums[nums.length-1];
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += Math.abs(ele - nums[i]);
        }
        return sum;
    }
}