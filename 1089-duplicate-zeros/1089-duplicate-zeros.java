class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans = new int[arr.length];

        int i = 0, j = 0;

        while (i < arr.length && j < arr.length) {
            ans[i] = arr[j];

            if (arr[j] == 0 && i + 1 < arr.length) {
                ans[++i] = 0;
            }

            i++;
            j++;
        }

        for (int k = 0; k < arr.length; k++) {
            arr[k] = ans[k];
        }
    }
}