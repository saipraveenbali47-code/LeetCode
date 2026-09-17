class Solution {
    public static void solve(int[]arr, int index, int target, List<Integer> current, List<List<Integer>> result){
     
            if(target == 0){
                result.add(new ArrayList<>(current));
                return;
            }
        for(int i = index; i < arr.length; i ++){
            if(arr[i] > target) break;
            if(i > index && arr[i] == arr[i - 1]) continue;
            current.add(arr[i]);
            solve(arr, i + 1, target - arr[i], current , result);
            current.remove(current.size() - 1);
            
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        solve(candidates, 0, target, current, result);
        return result;
    }
}