class Solution {
    public int numRabbits(int[] answers) {
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<answers.length;i++){
            hm.put(answers[i],hm.getOrDefault(answers[i],0)+1);
        }
        for(Integer key : hm.keySet()){
            int keyValue = key + 1;
            int count = hm.get(key);
            int group = (count + keyValue - 1) / keyValue;
            ans += group * keyValue;
        }
        return ans;
    }
}