class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int i = 0;
        int n = nums.length;
        Long ans = 0L;
        while(i < n){
            if(nums[i] != 0){
                i ++;
                continue;
            }
            int j = i;
            while(j < n && nums[j] == 0){
                j ++;
            }
            long len = j - i;
            ans += (len *(len + 1)) / 2;

            i = j;

        }
        return ans;
    }
}