class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int sum = 0, maxElement = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
            sum += num;
            maxElement = Math.max(maxElement, num);
        }
        n -= 1;
        int expectedSum = (n * (n + 1)) / 2;
        expectedSum += n;
        return expectedSum == sum && set.size() == n && maxElement == n;
    }
}