import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        
        for (int n : numbers) {
            answer.add(n * 2);
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}