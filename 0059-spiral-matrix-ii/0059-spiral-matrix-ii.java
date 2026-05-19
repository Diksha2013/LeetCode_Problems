class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int fc = 0; 
        int lc = arr[0].length - 1;
        int fr = 0;
        int lr = arr.length - 1;
        int dir = -1;
        int total = n*n; 
        int a = 1;
        while(a<=total){ 
            dir = (dir+1)%4;
            if(dir == 0){
                for(int j = fc; j<=lc;j++){ 
                    arr[fr][j]=a;
                    a++; 
                } 
                fr++;
            }
            else if(dir == 1){
                for(int i = fr; i<=lr;i++){ 
                    arr[i][lc]=a;
                    a++; 
                } 
                lc--;
            }
            else if(dir == 2){
                for(int j = lc; j>=fc;j--){ 
                    arr[lr][j]=a;
                    a++;
                } 
                lr--;
            }
            else{
                for(int i = lr; i>=fr;i--){ 
                    arr[i][fc] = a;
                    a++; 
                } 
                fc++;
            }
        }
        return arr;
    }
}