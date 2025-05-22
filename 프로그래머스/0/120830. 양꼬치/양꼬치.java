class Solution {
    public int solution(int n, int k) {
        // 1. 서비스로 받은 음료수 갯수
        int drink = n / 10;
        
        // 2. 돈주고 먹은 음료수
        k -= drink;
        return n * 12000 + k * 2000;
    }
}