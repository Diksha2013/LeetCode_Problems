class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        boolean unique = true;
        for(Integer key1 : hm.keySet()){
            int value1 = hm.get(key1);
            int count = 0;
            for(Integer key2 : hm.keySet()){
                int value2 = hm.get(key2);
                if(value1 == value2){
                    count++;
                }
            }
            if(count > 1){
                unique = false;
                break;
            }
        }
        
        return unique;
    }
}