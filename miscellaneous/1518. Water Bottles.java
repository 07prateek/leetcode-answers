// SUSHANT SINHA

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int empty=numBottles;
        int drink=numBottles;
        
        while(empty>=numExchange){
            
            int exchanged=(empty/numExchange);
            empty-=(exchanged*numExchange);
            drink+=exchanged;
            empty+=exchanged;
            
            
        }
            
        return drink;
        
    }
}