class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int k = 0; k < 32; k ++){
            int count = 0;
            for(int num : nums){
                if((num & (1 << k)) != 0) count ++;
            }
            if(count % 3 != 0)result |= (1 << k);
        }
        return result;
    }
}