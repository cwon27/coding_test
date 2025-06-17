import java.util.stream.IntStream;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // a, b 대소관계
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        
        answer = (max - min + 1) * (min + max) / 2;
        
        return answer;
    } 
}