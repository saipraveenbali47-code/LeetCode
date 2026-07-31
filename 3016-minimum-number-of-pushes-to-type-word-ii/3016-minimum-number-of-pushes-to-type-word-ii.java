class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(int i = 0; i < word.length(); i ++){
            char c = word.charAt(i);
            freq[c - 'a'] ++;
        }
        Arrays.sort(freq);
        int res = 0;
        for(int i = 25; i >= 0; i --){
            res += ((25 - i)/8 + 1) * freq[i];                
        }
        return res;
    }
}