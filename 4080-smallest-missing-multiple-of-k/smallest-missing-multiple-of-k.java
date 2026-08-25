class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int mul =k;
        while(true){
            boolean found = false;
            for(int ele : nums){
                if(ele == mul){
                    found = true;
                    break;
                }
            }
            if(!found){
                return mul;
            }
            mul+=k;

        }
        
    }
}