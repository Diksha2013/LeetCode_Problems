class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        for(int i = 0; i<nums.length;i++){
            int rev = 0;
            while(nums[i]!=0){
                int rem = nums[i]%10;
                rev = rev*10+rem;
                nums[i] = nums[i]/10;
            }
            if(!hs.contains(rev)){
                hs.add(rev);
            }
        }
        return hs.size();
    }
}