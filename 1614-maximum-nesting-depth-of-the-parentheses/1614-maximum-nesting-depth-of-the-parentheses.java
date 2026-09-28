class Solution {
    public int maxDepth(String s) {
        int pos = 0, maxdepth = Integer.MIN_VALUE;
        for(char c  : s.toCharArray()){
            if(c == '('){ pos ++;maxdepth = Math.max(pos, maxdepth);}
            else if(c == ')') pos --;
            
        }
        return maxdepth == Integer.MIN_VALUE ? 0 : maxdepth;
    }
}