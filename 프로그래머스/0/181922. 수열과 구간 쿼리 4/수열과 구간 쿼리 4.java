class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int target = queries[i][2];
            
            for (int j = start; j <= end; j++) {
                if (j % target == 0) {
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}