class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        sum -= x;
        if(sum == 0)return nums.length;
        int left = 0;
        int currentSum = 0;
        int maxlen = 0;
        for(int right = 0; right < nums.length; right ++){
            currentSum += nums[right];
            while(currentSum > sum && left <= right){
                currentSum -= nums[left];
                left ++;
            }
            if(currentSum == sum) maxlen = Math.max(right - left + 1, maxlen);
        }
        return maxlen == 0 ? -1 : nums.length - maxlen;
    }
}