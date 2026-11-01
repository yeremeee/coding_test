import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int n = arr.length;
        int[] before = arr;
        int[] after = new int[n];
        
        while (true) {
            for (int i = 0; i < n; i++) {
                int num = before[i];
                
                if (num >= 50 && num % 2 == 0) {
                    after[i] = num / 2;
                } else if (num < 50 && num % 2 == 1) {
                    after[i] = num * 2 + 1;
                } else {
                    after[i] = num;
                }
            }
            
            if (Arrays.equals(before, after)) {
                break;
            }
            
            before = after.clone();
            answer++;
        }
        
        return answer;
    }
}