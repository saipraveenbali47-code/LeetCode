class Solution {
    public int strStr(String haystack, String needle) {
        int pos = haystack.indexOf(needle);
        return pos >= 0 ? pos : -1; 
    }
}