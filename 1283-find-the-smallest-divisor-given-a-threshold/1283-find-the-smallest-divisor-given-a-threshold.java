class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxNum = Integer.MIN_VALUE;
        for(int num : nums){
            maxNum = Math.max(maxNum, num);
        }
        int low = 1, high = maxNum, ans = high;
        while(low <= high){
            int sum = 0;
            int mid = (low + high) / 2;
            for(int i = 0; i < nums.length; i ++){
                sum += Math.ceil((nums[i] + mid -1)  / mid);
            }
            if(sum <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}