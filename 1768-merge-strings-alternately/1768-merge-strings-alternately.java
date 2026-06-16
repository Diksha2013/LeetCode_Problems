class Solution {
    public String mergeAlternately(String word1, String word2) {
       String merge = new String();
       int left = 0;
       int right = 0;
       int count = 0;
       while(left < word1.length() && right < word2.length()){
        if(count%2==0){
            merge += word1.charAt(left);
            left++; 
            count++;
        }else{
            merge += word2.charAt(right);
            right++; 
            count++;
        }
       } 
       while(left < word1.length()){
            merge += word1.charAt(left);
            left++;
       }
       while(right < word2.length()){
            merge += word2.charAt(right);
            right++;
       }
       return merge;
    }
}