class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        int count = 0;
        boolean oddFound = false;
        
        for(int freq : hm.values()) {
            if(freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1;
                oddFound = true; 
            }
        }
        if(oddFound) {
            count += 1;
        }
        return count;
    }
}