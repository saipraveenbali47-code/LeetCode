class Solution {
    public boolean isPowerOfTwo(int n) {
        int sqrt = (int) Math.ceil((Math.sqrt(n)));
        for(int i = 0; i <= sqrt; i ++){
            if(n == Math.pow(2,i)) return true;
        }
        return false;
    }
}