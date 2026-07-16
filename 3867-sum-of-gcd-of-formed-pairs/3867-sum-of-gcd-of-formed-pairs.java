class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int mx = 0;
        int[] prefixGcd = new int[n];
        
        for(int i = 0; i < n; i ++){
            mx = Math.max(nums[i], mx);
            prefixGcd[i] = gcd(nums[i],mx);
        }
        Arrays.sort(prefixGcd);
        int left = 0, right = n -1;long sum = 0;
        while(left < right){
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left ++;
            right --;
        }
        return sum;
    }
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a % b);
    }
}