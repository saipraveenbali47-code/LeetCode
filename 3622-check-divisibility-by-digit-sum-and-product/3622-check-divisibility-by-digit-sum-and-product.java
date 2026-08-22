class Solution {
    public boolean checkDivisibility(int n) {
        int number = n, sum = 0, prod = 1;
        while(number > 0){
            int remainder = number % 10;
            sum += remainder;
            prod *= remainder;
            number /= 10;
        }
        return (n %(sum + prod) == 0);
    }
}