import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        Set<String> strSet = new HashSet<>();
        for(String s : s1) {
            strSet.add(s);
        }
        
        for(String s : s2) {
            if(strSet.contains(s)) {
                answer++;
            }
        }
        
        return answer;
    }
}