class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        int max = 0;
        String ans = "";
        for(int i=0; i<s.length()-1 ;i++){
           for(int j=i+1; j<=s.length(); j++){
                String str = s.substring(i,j);
                if(isPalindrome(str)){
                    if(str.length()>max){
                        max = str.length();
                        ans = str;
                    }
                }
           }
        }
        return ans;
    }
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        boolean isPalindrome = true;
        while(left < right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return isPalindrome;
    }
}