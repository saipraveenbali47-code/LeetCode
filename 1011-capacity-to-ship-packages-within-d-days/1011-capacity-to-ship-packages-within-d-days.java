class Solution {
    public  boolean isPossible(int [] weights, int days, int mid){
        int sum = 0, count = 1;
        for(int num : weights){
            sum += num;
            if(sum > mid){
                sum = num;
                count ++;
            }
        }
        return count <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = Integer.MIN_VALUE, totalWeights = 0;
        for(int num : weights){
            maxWeight = Math.max(maxWeight, num);
            totalWeights += num;
        }
        int low = maxWeight, high = totalWeights;
        while(low <= high){
            int mid = (low + high) / 2;
            if(isPossible(weights,days, mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}