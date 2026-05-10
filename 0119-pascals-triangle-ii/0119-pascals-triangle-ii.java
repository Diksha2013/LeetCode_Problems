class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ls = new ArrayList<>();
        long res = 1;
        for (int i = 0; i <= rowIndex; i++) {
            ls.add((int)res);
            res = res * (rowIndex - i) / (i+1);
        }
        return ls;
    }
}