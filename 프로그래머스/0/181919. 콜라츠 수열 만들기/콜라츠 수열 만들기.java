import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        
        while (n > 1) {
            result.add(n);
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        
        result.add(n);
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}