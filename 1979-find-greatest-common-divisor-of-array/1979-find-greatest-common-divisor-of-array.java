class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        int lowest = nums[0];
        int highest = nums[nums.length - 1];
        int ans = 1;

        for (int i = 1; i <= lowest ; i++) {
            if (lowest % i == 0 && highest % i == 0) {
                ans = i;
            }
        }
        return ans;
    }
}