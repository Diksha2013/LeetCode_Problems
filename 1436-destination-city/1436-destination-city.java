class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> starts = new HashSet<>();
        for(int i = 0 ;i<paths.size();i++){
            starts.add(paths.get(i).get(0));
        }
        for(int i = 0 ;i<paths.size();i++){
            if(!starts.contains(paths.get(i).get(1)))
            return paths.get(i).get(1);
        }
        return "";
    }
}