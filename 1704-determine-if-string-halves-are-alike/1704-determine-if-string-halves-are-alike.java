class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int count = 0;
        for(int i = 0;i<mid;i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                count++;
            }
        }  
        for(int i = mid;i<s.length() ;i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                count--;
            } 
        }
        if(count == 0){
            return true;
        }
        return false;
    }
}