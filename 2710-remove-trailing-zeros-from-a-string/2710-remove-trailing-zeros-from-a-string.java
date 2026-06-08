class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder s = new StringBuilder();
        int i = num.length()-1;
        int a = 0;
        while(num.charAt(i) == '0'){
            a++;
            i--;
        }
        for(int j = 0;j<(num.length()-a);j++){
            s.append(num.charAt(j));
        }
        return s.toString();
    }
}