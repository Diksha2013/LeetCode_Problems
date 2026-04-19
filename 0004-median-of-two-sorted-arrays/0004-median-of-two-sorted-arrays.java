class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length+nums2.length];
        merge(nums1,nums2,merged);
        int index = 0;
        double median = 0;
        int low = 0;
        int high = merged.length-1;
        if(merged.length%2==0){
            int mid = (low + high)/2;
            median = (double)(merged[mid] + merged[mid+1])/2;
        }
        else{
            index = (low + high)/2;
            median = merged[index];
        }
        return median;
    }
    public static void merge(int nums1[], int nums2[],int merged[]){
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                merged[k] = nums1[i];
                k++;
                i++;
            }else{
                merged[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            merged[k] = nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            merged[k] = nums2[j];
            k++;
            j++;
        }
    }
}