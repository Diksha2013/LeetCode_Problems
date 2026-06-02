class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for (Integer key : hm.keySet()) {
            if(hm.get(key)>2){
                return false;
            }
        }
        return true;
    }
}