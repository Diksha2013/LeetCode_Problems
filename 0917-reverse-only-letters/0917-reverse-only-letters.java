class Solution {
    public String reverseOnlyLetters(String s) {
        String ans = "";
        int a = 1;
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                while(!Character.isLetter(s.charAt(s.length()-a))){
                    a++;
                }
                ans += s.charAt(s.length()-a);
                a++;
            }else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}