class Solution { 
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            for(int j = 0; j < nums[i].length; j ++){
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
            }
        }
        List<Integer> ls = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == nums.length){
                ls.add(entry.getKey());
            }
        }
        Collections.sort(ls);
        return ls;
    }
}