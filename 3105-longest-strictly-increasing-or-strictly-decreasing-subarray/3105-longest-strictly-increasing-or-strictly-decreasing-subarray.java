class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       
        int max = 1;
        for(int i=0; i<nums.length-1; i++){
            int count = 1;
            for(int j=i; j<nums.length-1; j++){
                if(nums[j]>nums[j+1]){
                    count++;
                }else{
                    break;
                }
            }
            if(max<count){
                max = count;
            }
        }
        for(int i=0; i<nums.length-1; i++){
            int count = 1;
            for(int j=i; j<nums.length-1; j++){
                if(nums[j]<nums[j+1]){
                    count++;
                }else{
                    break;
                }
            }
            if(max<count){
                max = count;
            }
        }
        return max;
    }
}