class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> first = new HashMap<>();
        HashMap<Integer,Integer> last = new HashMap<>();
        int degree = 0;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            first.putIfAbsent(num,i);
            last.put(num,i);
            int currCount = hm.getOrDefault(nums[i],0)+1;
            hm.put(nums[i],currCount);
            degree = Math.max(degree,currCount);
        }
        int min = nums.length;
        for(Integer key: hm.keySet()){
            if(degree == hm.get(key)){
                int length = last.get(key) - first.get(key)+1;
                min = Math.min(min,length);
            }
        }
        return min;
    }
}