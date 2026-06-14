class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0;
        int small = 0;
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>=65 && ch<=90){
                capital++;
            }
            if(ch>=97 && ch<=122){
                small++;
            }
        }
        char first = word.charAt(0);
        if(first>=65 && first<=90){
            if(capital == word.length() || small == word.length()-1){
                return true;
            }
        }else{
            if(small == word.length()){
                return true;
            }
        }
        return false;
    }
}