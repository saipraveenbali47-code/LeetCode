class Solution {
    public int smallestNumber(int n, int t) {
        int last = (int) (Math.ceil(n / 10.0) * 10);
        for(int i = n; i <= last; i ++){
            int product = digitProduct(i);
            if(product %   t == 0) return i;
        }
        return -1;
    }
    public int digitProduct(int num){
        int product = 1;
        while(num > 0){
            product *= num % 10;
            num /= 10;
        }
        return product;
    }
}