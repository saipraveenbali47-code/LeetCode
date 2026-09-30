class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int current = 0;
        int i = 0;
        int[] result = new int[seq.length()];
        for(int c : seq.toCharArray()){
            if(c == '('){
                current ++;
                result[i] = current % 2;
                i ++;
            }
            else if(c == ')'){
                result[i] = current % 2;
                i ++;
                current --;
            }

        }
        return result;
    }
}