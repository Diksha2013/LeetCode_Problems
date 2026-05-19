class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        int fc = 0; 
        int lc = matrix[0].length - 1;
        int fr = 0;
        int lr = matrix.length - 1;
        int dir = -1;
        int total = matrix.length*matrix[0].length; 
        while(total!=0){ 
            dir = (dir+1)%4;
            if(dir == 0){
                for(int j = fc; j<=lc;j++){ 
                    ls.add(matrix[fr][j]);
                    total--; 
                } 
                fr++;
            }
            else if(dir == 1){
                for(int i = fr; i<=lr;i++){ 
                    ls.add(matrix[i][lc]);
                    total--; 
                } 
                lc--;
            }
            else if(dir == 2){
                for(int j = lc; j>=fc;j--){ 
                    ls.add(matrix[lr][j]);
                    total--; 
                } 
                lr--;
            }
            else{
                for(int i = lr; i>=fr;i--){ 
                    ls.add(matrix[i][fc]);
                    total--; 
                } 
                fc++;
            }
        }
        return ls;
    }
}