class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right ++){
            char rightCh = s.charAt(right);
            map.put(rightCh, map.getOrDefault(rightCh, 0) + 1);
            while(map.get(rightCh) > 2){
                char leftCh = s.charAt(left);
                map.put(leftCh, map.get(leftCh) - 1);
                left ++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}