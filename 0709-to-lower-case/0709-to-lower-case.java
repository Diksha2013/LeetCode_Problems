class Solution {
    public String toLowerCase(String s) {
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90){
               s = s.replace(ch,(char)(ch+32));
            }
        }
        return s;
    }
}