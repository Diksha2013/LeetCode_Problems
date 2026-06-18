class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        for(int i = 0; i<k; i++){
            ans.append(words[i]);
            if(i<k-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}