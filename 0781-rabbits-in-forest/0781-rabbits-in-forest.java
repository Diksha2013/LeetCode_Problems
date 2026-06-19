class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int ans = answers[0]+1;
        int count = 1;
        for(int i = 1; i<answers.length;i++){
            if(answers[i]!=0 && answers[i] == answers[i-1]){
                count++;
                if(answers[i]+2 == count){
                    count = 1;
                }
            }else{
                count = 1;
            }
            if(answers[i]!=0 && count == 1){
                ans += answers[i]+1;
            }
            if(answers[i]==0){
                ans++;
            }
        }
        return ans;
    }
}