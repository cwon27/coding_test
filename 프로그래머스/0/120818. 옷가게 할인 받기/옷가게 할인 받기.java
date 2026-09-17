class Solution {
    public int solution(int price) {
        int[] prices = {500000, 300000, 100000};
        double[] rates = {0.8, 0.9, 0.95};
        double answer = price;
        
        for(int i = 0; i < prices.length; i++) {
            if(price >= prices[i]) {
                answer = price * rates[i];
                break;
            }
        }
        
        return (int) answer;
    }
}