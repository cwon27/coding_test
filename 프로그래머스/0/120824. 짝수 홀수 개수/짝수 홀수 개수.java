class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[2];
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                // 짝수
                even++;
            } else {
                // 홀수
                odd++;
            }
        }
        
        arr[0] = even;
        arr[1] = odd;
        
        return arr;
    }
}