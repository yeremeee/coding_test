import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> dMap = new HashMap<>();
            
            for (int j = i; j < i + 10; j++) {
                dMap.put(discount[j], dMap.getOrDefault(discount[j], 0) + 1);
            }
            
            if (map.equals(dMap)) {
                answer++;
            }
        }
    
        
        return answer;
    }
}