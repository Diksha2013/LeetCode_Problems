class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        ArrayList <Integer> al = new ArrayList<>();
        for(Integer key : hm.keySet()){
            if(hm.get(key)>1){
                al.add(key);
            }
        }
        return al;
    }
}