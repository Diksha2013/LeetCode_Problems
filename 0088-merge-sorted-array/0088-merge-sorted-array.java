class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int merged[] = new int[m+n];
        int blue = 0, green = 0, red = 0;
        while(blue<m && green<n){
            if(nums1[blue] <= nums2[green]){
                merged[red] = nums1[blue];
                red++;
                blue++;
            }
            else{
                merged[red] = nums2[green];
                red++;
                green++;
            }
        }
        while(blue<m){
            merged[red] = nums1[blue];
            red++;
            blue++;
        }
        while(green<n){
            merged[red] = nums2[green];
            red++;
            green++;
        }
        for(int i = 0 ;i<m+n;i++){
            nums1[i] = merged[i];
        }
        System.out.print("[");
        for(int i = 0;i<m+n;i++){
            System.out.print(nums1[i]+",");
        }
        System.out.println("]");
    }
}