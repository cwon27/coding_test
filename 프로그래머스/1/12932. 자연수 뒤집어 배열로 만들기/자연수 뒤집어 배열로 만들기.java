class Solution {
    public int[] solution(long n) {
        String[] a = String.valueOf(n).split("");
        
        int[] arr = new int[a.length];
        
        for(int i = 0; i < a.length; i++) {
            arr[i] = Integer.parseInt(a[a.length-1-i]);
        }
        
        return arr;
    }
}