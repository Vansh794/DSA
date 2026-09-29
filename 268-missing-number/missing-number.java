class Solution {
    public int missingNumber(int[] nums) {
        long n = nums.length;
        long arraysum = n*(n+1)/2;
        long sum =0;
        for(long ele : nums){
            sum+=ele;
        }
        return (int)(arraysum - sum);

    }
}