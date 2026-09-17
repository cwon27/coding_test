import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String a : s1) {
            for(String b : s2) {
                if(a.equals(b)) {
                    answer++;
                    break; // 중복 안된다 했으니 있으면 걍 바로 나가기
                }
            }
        }
        
        return answer;
    }
}