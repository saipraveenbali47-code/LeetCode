class Solution {
    public long sumAndMultiply(int n) {
        long number = 0;
        long sum = 0;
        long place = 1;
        while(n > 0){
            long rem = n % 10;
            if(rem != 0){
                sum += rem;
                number = number + rem * place;
                place = place * 10;
            }
             n = n / 10;
        }
        return sum * number;
    }
}