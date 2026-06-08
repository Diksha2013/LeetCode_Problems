class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[] = new int[nums.length];
        int even = 0;
        int odd = nums.length-1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[even] = nums[i];
                even++;
            }else{
                ans[odd] = nums[i];
                odd--;
            }
        }
        return ans;
    }
}