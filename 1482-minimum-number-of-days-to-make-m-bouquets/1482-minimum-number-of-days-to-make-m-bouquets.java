class Solution {
    public boolean isPossible(int[] bloomDay, int m, int k, int day){
        int count = 0, totalDays = 0;
        for(int i = 0; i < bloomDay.length; i ++){
            if(bloomDay[i] <= day){
                count ++;
            }
            else{
                totalDays += (count / k);
                count = 0;
            }
        }
        totalDays += (count / k);
        if(totalDays >= m){
            return true;
        }
        else return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int minD = Integer.MAX_VALUE, maxD = Integer.MIN_VALUE;
        if ((long)m * k > bloomDay.length) return -1;
        for(int num : bloomDay){
            minD = Math.min(num, minD);
            maxD = Math.max(num, maxD);
        }
        int low = minD, high =maxD;
        while(low <= high){
            int mid = (low + high) / 2;
            if(isPossible(bloomDay, m, k, mid)){
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return low;
    }
}