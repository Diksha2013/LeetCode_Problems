class Solution {
    public int[] getConcatenation(int[] nums) {
        int concat[] = new int[nums.length+nums.length];
        for(int i = 0;i<nums.length;i++){
            concat[i] = nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            concat[nums.length+i] = nums[i];
        }
        return concat;
    }
}