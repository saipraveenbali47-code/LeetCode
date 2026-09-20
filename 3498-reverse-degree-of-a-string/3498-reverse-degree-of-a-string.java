class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i ++){
            int product = (i + 1) * ('z' - s.charAt(i)  + 1);
            sum += product;
        }
        return sum;
    }
}