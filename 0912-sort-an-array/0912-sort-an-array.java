class Solution {
    public int[] sortArray(int[] nums){
        int low = 0;
        int high = nums.length-1;
        f(nums,low,high);
        return nums;
    }
    public static void f(int arr[], int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        f(arr,low,mid);
        f(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[],int low,int mid, int high){
        int merged[] = new int[(high-low)+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                merged[k] = arr[i];
                k++;
                i++;
            }else{
                merged[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            merged[k] = arr[i];
            k++;
            i++;
        }
        while(j<=high){
            merged[k] = arr[j];
            k++;
            j++;
        }
        for(int l = 0;l<merged.length;l++){
            arr[low+l] = merged[l];
        }
    }
}