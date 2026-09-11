class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count_1s = 0, count_0 = 0;
        for(char i : s.toCharArray()){
            if(i == '1')count_1s ++;
            else count_0 ++;
        }
        String res = "";
        while(count_1s > 1){
            res += "1";
            count_1s --;
        }
        while(count_0 > 0){
            res += "0";
            count_0 --;
        }
        res += "1";
        return res;
    }
}