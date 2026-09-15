class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        // 최대로 마실 수 있는 아메리카노의 잔 수
        int a = money / 5500;
        
        // 남는 돈
        int b = money - (5500 * a);
        
        // 배열에 넣기
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}