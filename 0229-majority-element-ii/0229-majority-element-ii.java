class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Integer key: hm.keySet()){
            if(hm.get(key)>nums.length/3){
                ls.add(key);
            }
        }
        return ls;
    }
}