class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count = 0;
        int ans[] = new int[nums.length];
         
        for (int num : nums) {
            if (num < pivot) {
                ans[count++] = num;
            }
        }
        
        for (int num : nums) {
            if (num == pivot) {
                ans[count++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                ans[count++] = num;
            }
        }

        return ans;
    }
}