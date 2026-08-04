class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int array_sum = 0, original_sum = 0, minelement = Integer.MAX_VALUE, maxelement = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i ++){
            minelement = Math.min(minelement , nums[i]);
            maxelement = Math.max(maxelement, nums[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = minelement; i <= maxelement; i ++){
            ans.add(i);
        }
       for(int num : nums){
       ans.remove(Integer.valueOf(num));
       }
        return ans;
    }
}