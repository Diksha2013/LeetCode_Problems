class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        for(int i = 0; i<nums1.length; i++){
            boolean isPresent = false;
            for(int j = 0; j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    isPresent = true;
                }
            }
            if(!isPresent && ( ls1.isEmpty() || !ls1.contains(nums1[i]))){
                ls1.add(nums1[i]);
            }
        }
        for(int i = 0; i<nums2.length; i++){
            boolean isPresent = false;
            for(int j = 0; j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    isPresent = true;
                }
            }
            if(!isPresent && ( ls2.isEmpty() || !ls2.contains(nums2[i]))){
                ls2.add(nums2[i]);
            }
        }
        ls.add(ls1);
        ls.add(ls2);
        return ls;
    }
}