import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        Integer[] arr = new Integer[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int i : arr) {
            sb.append(i);
        }
        
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}