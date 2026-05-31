class Solution {
    public int minimumDeletions(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int count = 0;
        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
                minIndex = i;
            }
            if(nums[i]>max){
                max = nums[i];
                maxIndex = i;
            }
        }
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);
        int front = right+1;
        int end = nums.length - left;
        int both = (left + 1) + (nums.length - right);

        return Math.min(front, Math.min(end, both));
    }
}