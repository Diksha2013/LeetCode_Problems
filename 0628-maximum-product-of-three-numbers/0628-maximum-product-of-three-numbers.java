class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int leftprod = nums[0]*nums[1]*nums[n-1];
        int rightprod = nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(leftprod,rightprod);
    }
}