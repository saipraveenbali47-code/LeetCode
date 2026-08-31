class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0 , maxIndex = 0; 
        int minNum = Integer.MAX_VALUE, maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < minNum){ 
                minNum = nums[i];
                minIndex = i;
            }
            if(nums[i] > maxNum){
                maxNum = nums[i];
                maxIndex = i;
            }
        }
        int a = Math.max(minIndex, maxIndex) + 1;
        int b = nums.length - Math.min(minIndex, maxIndex);
        int c = Math.min(minIndex, maxIndex) + 1 + (nums.length - Math.max(minIndex, maxIndex));
        return Math.min(a, Math.min(b, c));
    }
}