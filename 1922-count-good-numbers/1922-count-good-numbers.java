class Solution {
    static final long MOD =  1_000_000_007;
    public int countGoodNumbers(long n) {
        long evenPosition = (n + 1) / 2;
        long oddPosition = (n ) / 2;
        long  ans = pow(5 , evenPosition);
        ans = (ans *  pow(4, oddPosition)) % MOD;
        return (int) ans;
    }
    public long pow(long base, long exponent){
        long result = 1;
        while(exponent > 0){
            if(exponent % 2 == 1){
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }
        return result;
    }
}