class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        int index = -1;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int rightsum = sum;
        for(int i = 0; i<nums.length;i++){
            rightsum -= nums[i];
            if(leftsum == rightsum){
                index = i;
                break;
            }
            leftsum += nums[i];
        }
        return index;
    }
}