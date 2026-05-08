class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();

        if (s.length() != t.length()) return false;

        int[] counts = new int[256]; 

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++; 
            counts[t.charAt(i)]--; 
        }

        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;

    }
}