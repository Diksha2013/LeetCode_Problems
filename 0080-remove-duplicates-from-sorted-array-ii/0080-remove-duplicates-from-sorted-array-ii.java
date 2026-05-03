class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int num = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(count<2){
                nums[num] = nums[i];
                num++;
            }
            if(nums[i]==nums[i+1]){
                count++;
            }
            if(nums[i]!=nums[i+1]){
                count = 0;
            }
        }
        if(count<2){
            nums[num] = nums[nums.length-1];
            num++;
        }
        return num;
    }
}