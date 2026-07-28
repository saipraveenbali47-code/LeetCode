class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        Arrays.sort(arr, 0, n/2);
        for(int i = 0; i < n/2; i ++){
            arr[n - 1 - i] = arr[i];
        }
        return new String(arr);
    }
}