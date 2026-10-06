class Solution {
    public boolean checkValidString(String s) {
        int close = 0;
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '(' || s.charAt(i) == '*'){
                close ++;
            }
            else{ close --;}

            if(close < 0) return false;
        }
        close = 0;
        for(int i = s.length() - 1; i >= 0; i --){
            if(s.charAt(i) == ')' || s.charAt(i) == '*'){
                close ++;
            }
            else{ close --;}
            if(close < 0) return false;
        }
        return true;
    }
}