class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] sd = new int[nums.length];
        sd[0] = nums[0];
        for(int i = 1; i < nums.length; i ++){
            sd[i] = Math.max(nums[i], sd[i - 1]);
        }
        int minNum = Integer.MAX_VALUE;
        for(int i = nums.length - 1; i >= 0; i --){
            minNum = Math.min(nums[i], minNum);
            sd[i] -= minNum;
        }

        for(int i = 0; i < sd.length; i ++){
            if(sd[i] <= k) return i;
        }
        return -1;
    }
}