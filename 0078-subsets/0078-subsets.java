class Solution {
    public static void printSubsets(int index, int[] arr, List<List<Integer>> result, List<Integer> current){
        if(index >= arr.length){
            result.add(new ArrayList<>(current));
            return ;
        }
        printSubsets(index + 1, arr, result, current);
        current.add(arr[index]);
        printSubsets(index + 1, arr, result, current); // take 
        current.remove(current.size() - 1);
        //printSubsets(index + 1, arr, result, current); // Not take condition 
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        printSubsets(0, nums, result, current);
        return result;
    }
}