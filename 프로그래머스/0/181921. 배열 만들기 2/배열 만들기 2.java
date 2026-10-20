import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String num = String.valueOf(i);
            boolean check = true;
            
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) != '5' && num.charAt(j) != '0') {
                    check = false;
                }
            }
            
            if (check) {
                result.add(i);
            }
        }
        
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}