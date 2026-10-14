import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        boolean[] visited = new boolean[cards.length];
        List<Integer> groups = new ArrayList<>();
        
        for (int i = 0; i < cards.length; i++) {
            if (visited[i]) {
                continue;
            }
            
            int count = 0;
            int index = i;
            
            while (!visited[index]) {
                visited[index] = true;
                count++;
                index = cards[index] - 1;
            }
            
            groups.add(count);
        }
        
        if (groups.size() < 2) {
            return 0;
        }
        
        groups.sort(Collections.reverseOrder());
        return groups.get(0) * groups.get(1);
    }
}