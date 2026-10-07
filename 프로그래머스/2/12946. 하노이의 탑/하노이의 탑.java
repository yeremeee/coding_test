import java.util.*;

class Solution {
    List<int[]> result = new ArrayList<>();
    
    public int[][] solution(int n) {
        move(n, 1, 3, 2);
        
        return result.toArray(new int[result.size()][]);
    }
    
    void move(int n, int from, int to, int via) {

        if (n == 1) {
            result.add(new int[]{from, to});
            return;
        }

        move(n - 1, from, via, to);

        result.add(new int[]{from, to});

        move(n - 1, via, to, from);
    }
}