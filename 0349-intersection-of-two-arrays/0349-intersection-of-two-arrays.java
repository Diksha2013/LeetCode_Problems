class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> hs = new HashSet<>();
        for(int i = 0; i < nums1.length;i++){
            hs.add(nums1[i]);
        }

        HashSet <Integer> intersect = new HashSet<>();
        for(int i = 0; i < nums2.length;i++){
            if(hs.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }

        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}