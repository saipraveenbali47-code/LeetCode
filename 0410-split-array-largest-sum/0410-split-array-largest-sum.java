class Solution {
    public boolean canSplitArray(int[] nums, int k, int mid){
        int currentSum = 0, subarrays = 1;
        for(int num : nums){
            if(currentSum + num <= mid){
                currentSum += num;
            }
            else {subarrays ++; currentSum = num;}
        }
        return subarrays <= k;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for(int num : nums){
            low = Math.max(num, low);
            high += num;
        }
        int ans = high;
        while(low <= high){
            int mid = (low + high) / 2;
            if(canSplitArray(nums, k, mid)){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}