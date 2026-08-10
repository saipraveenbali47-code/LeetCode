class Solution {
    public int firstUniqChar(String s) {
        for(char c : s.toCharArray()){
            int index = s.indexOf(c);
            int last = s.indexOf(c, index + 1);
            if(last == -1) return index;
        }
        return -1;
    }
}