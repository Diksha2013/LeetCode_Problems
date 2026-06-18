class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0;i<sentences.length;i++){
            int count = 1;
            for(int j = 0;j<sentences[i].length();j++){
                char ch = sentences[i].charAt(j);
                if(ch == ' '){
                    count++;
                }
            }
            if(max<count){
                max = count;
            }
        }
        return max;
    }
}