class Solution {
    public int minOperations(int[] nums) {
        int total = 0;
        for(int i = 1; i < nums.length; i ++){
            int previous = nums[i - 1];
            int current = nums[i];
            if(current <= previous){
                int operations = previous - current + 1;
                nums[i] = previous + 1;
                total += operations;
            }
        }
        return total;
    }
}