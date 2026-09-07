class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i = 1; i <= n; i ++){
            int b = n - i;
            if(isNonZero(i) && isNonZero(b)) return new int[]{i,b};
        }
        return new int[]{-1, -1};
    }
    public boolean isNonZero(int num){
        while(num > 0){
            if(num % 10 == 0) return false;
            num /= 10;
        }
        return true;
    }
}