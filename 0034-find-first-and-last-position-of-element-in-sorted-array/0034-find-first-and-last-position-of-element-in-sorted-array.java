class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int start = lowerbound(nums,target);
        int end = upperbound(nums,target);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{start, end-1};
    }
    public static int lowerbound(int [] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int upperbound(int [] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid]>target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}