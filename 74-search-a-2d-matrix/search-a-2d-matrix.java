class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        int low=0;
        int high = row*col -1;
        while(low<=high){
            int mid=(low+high)/2;
            int midrow = mid/col, midcol = mid%col;
            if(arr[midrow][midcol] == target) return true;
            else if(arr[midrow][midcol] > target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
}