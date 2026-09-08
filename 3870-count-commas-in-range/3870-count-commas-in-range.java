class Solution {
    public int countCommas(int n) {
        if(n >= (1000)){
            n -= 1000;
            return n + 1;
        }
        else if(n >= 100000){
            n -= 100000;
            return (n + 1) * 2;
        }
        return 0;
    }
}