class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ls = new ArrayList<>();
        int left = firstOcc(nums,target);
        int right = lastOcc(nums,target);
        for(int i = left; i<=right; i++){
            if(i!=-1){
                ls.add(i);
            }
        }
        return ls;
    }
    public static int firstOcc(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int first = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return first;
    }
    public static int lastOcc(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int end = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                end = mid;
                low = mid+1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return end;
    }
}