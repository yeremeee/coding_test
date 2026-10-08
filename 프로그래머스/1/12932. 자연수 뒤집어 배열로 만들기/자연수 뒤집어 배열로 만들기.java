import java.util.*;

class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        
        int[] answer = new int[s.length()];
        
        for (int i = s.length() - 1; i >= 0; i--) {
            answer[s.length() - 1 - i] = arr[i] - '0';
        }
        return answer;
    }
}