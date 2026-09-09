class Solution {
    public long countCommas(long n) {
        long total = 0;
        long a = n - 999;
        if(a > 0){
            total += a;
            a = n - 999999;
            if(a > 0){
                total += a;
                a = n - 999999999;
                if(a > 0){
                    total += a;
                    a = n - 999999999999L;
                    if(a > 0){
                        total += a;
                        a = n - 999999999999999L;
                        if(a > 0){
                            total += a;
                        }
                    }
                }

            }
        }
        return total;
    }
}