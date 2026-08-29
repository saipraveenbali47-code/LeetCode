class Solution {
    public int diagonalPrime(int[][] nums) {
        int largest = 0;
        for(int i = 0; i < nums.length; i ++){
            if(isPrime(nums[i][i])) largest = Math.max(largest, nums[i][i]);
            if(isPrime(nums[i][ nums.length - i - 1])) largest = Math.max(largest, nums[i][nums.length - i - 1]);
        }
        return largest;
    }
    public boolean isPrime(int n){
        if(n < 2)return false;
        for(int i = 2; i * i <= n; i ++){
            if(n % i == 0) return false;
        }
        return true;
    }
}