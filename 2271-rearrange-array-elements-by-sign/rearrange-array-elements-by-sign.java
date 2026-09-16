class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int index1 =0;
        int index2 =0;
        for(int i =0;i<n;i++){
            if(nums[i] <= 0){
                arr1[index1++] = nums[i];
            }
            else{
                arr2[index2++] = nums[i];
            }
        }
        for(int i= 0;i<n/2;i++){
            nums[2*i] = arr2[i];
            nums[2*i+1] = arr1[i];
        }
        return nums;
        
    }
}