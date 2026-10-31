class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] idx : queries) {
            int start = idx[0];
            int end = idx[1];
            
            for (int i = start; i <= end; i++) {
                arr[i]++;
            }
        }
        
        return arr;
    }
}