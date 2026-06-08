class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int count = 0;
        s = s.toLowerCase();
        for(int i = 0;i<mid;i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }  
        for(int i = mid;i<s.length() ;i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count--;
            } 
        }
        if(count == 0){
            return true;
        }
        return false;
    }
}