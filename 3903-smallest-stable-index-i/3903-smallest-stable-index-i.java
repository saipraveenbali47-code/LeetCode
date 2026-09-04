class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i ++){
            maxNum = Math.max(maxNum, nums[i]);
            int minNum = Integer.MAX_VALUE;
            for(int j = i; j < nums.length; j ++){
                minNum = Math.min(minNum, nums[j]);
            }
            if((maxNum - minNum) <= k) return i;
        }
        return -1;
    }
}