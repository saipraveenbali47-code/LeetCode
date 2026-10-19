class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i ++){
        //     if(nums[i] == target){
        //         ls.add(i);
        //     }
        // }
        int smaller = 0, equal = 0; // helps to count the numbers less than and equals to target;
        for(int num : nums){
            if(num < target){
                smaller ++;
            }
            if(num == target){
                equal ++;
            }
        }
        for(int i = smaller; i < smaller + equal; i ++){ // so now we get the starting index of the target element
            ls.add(i);
        }
        return ls;
    }
}