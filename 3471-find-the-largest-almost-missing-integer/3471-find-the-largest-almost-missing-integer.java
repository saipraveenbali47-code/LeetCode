class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(k == 1){
            int answer = -1;
            int[] freq = new int[51];
            for(int num : nums){
                freq[num] ++;
            }
            for(int i = 0; i < freq.length; i ++){
                if(freq[i] == 1){
                    answer = Math.max(answer, i);
                }
            }
            return answer;
        }
        if(k == n){
            int answer = -1;
            for(int num : nums){
                answer = Math.max(answer, num);
            }
            return answer;
        }
        int answer = -1;
        int[] freq = new int[51];
        for(int num : nums){
            freq[num] ++;
        }
        if(freq[nums[0]] == 1) answer = Math.max(answer, nums[0]);
        if(freq[nums[n - 1]] == 1) answer = Math.max(answer, nums[n - 1]);
        return answer;
    }
}