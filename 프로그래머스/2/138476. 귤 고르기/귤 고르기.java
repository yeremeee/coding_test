import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int i : tangerine){
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> values = new ArrayList(countMap.values());
        values.sort(Collections.reverseOrder());
        
        int count = 0;
        
        for (int i : values){
            if (count < k){
                count += i;
                answer += 1;
            }
        }
        
        return answer;
    }
}