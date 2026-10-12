class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        while(empty >= numExchange){
            int new_bottles = empty /  numExchange;
            total += new_bottles;
            empty = empty % numExchange + new_bottles;
        }
        return total;
    }
}