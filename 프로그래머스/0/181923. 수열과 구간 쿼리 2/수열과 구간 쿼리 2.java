import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int[] subArr = Arrays.copyOfRange(
                    arr, queries[i][0], queries[i][1] + 1
                );
            Arrays.sort(subArr);
            
            int big = queries[i][2];
            
            for (int j = 0; j < subArr.length; j++) {
                if (subArr[j] > big) {
                    big = subArr[j];
                    answer[i] = big;
                    break;
                }
            }
            
            if (big == queries[i][2]) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}