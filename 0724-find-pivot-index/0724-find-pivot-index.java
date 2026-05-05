class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        int rightsum = 0;
        int index = -1;
        for(int i = 0; i<nums.length ;i++){
            sum = sum +nums[i];
        }
        rightsum = sum;
        for(int i = 0;i<nums.length;i++){
            rightsum = rightsum - nums[i];
            if(leftsum == rightsum){
                index = i;
                break;
            }
            leftsum = leftsum + nums[i];
        }
        return index;
    }
}