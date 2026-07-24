class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num : nums){
          ans ^= num;
        }
        return ans;
    }
}