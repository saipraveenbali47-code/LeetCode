class Solution {
    public int findGCD(int[] nums) {
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        for (int num : nums) {
            mx = Math.max(mx, num);
            mn = Math.min(mn, num);
        }
        return gcd(mn, mx);
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}