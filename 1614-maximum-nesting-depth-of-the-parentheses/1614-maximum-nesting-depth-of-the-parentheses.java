class Solution {
    public int maxDepth(String s) {
        int pos = 0, maxdepth = Integer.MIN_VALUE;
        for(char c  : s.toCharArray()){
            if(c == '(') pos ++;
            else if(c == ')') pos --;
            maxdepth = Math.max(pos, maxdepth);
        }
        return maxdepth;
    }
}