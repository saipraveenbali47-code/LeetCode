class Solution {
    public int maxArea(int[] nums) {
        int left = 0, right = nums.length - 1, maxArea = Integer.MIN_VALUE;
        while(left < right){
            int h = Math.min(nums[left], nums[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, (h * w));
            if(nums[left] < nums[right]) left ++;
            else right --;
        }
        return maxArea;
    }
}