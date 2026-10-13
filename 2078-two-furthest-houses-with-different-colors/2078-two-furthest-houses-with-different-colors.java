class Solution {
    public int maxDistance(int[] colors) {
        int minDis = 0;
        /* for(int i = 0; i < colors.length; i ++){
            for(int j = 0; j < colors.length; j ++){
                if(colors[i] != colors[j]){
                    minDis = Math.max(minDis, (j - i));
                }
            }
        }
        */
        int left = 0, right = colors.length -1;
        while(colors[left] == colors[right]){
            right --;
        }
        minDis = Math.max(minDis, (right - left));
        left = 0; right = colors.length -1;
        while(colors[left] == colors[right]){
            left ++;
        }
        minDis = Math.max(minDis, (right - left));

        return minDis;
    }
}