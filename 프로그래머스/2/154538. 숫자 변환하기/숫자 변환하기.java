import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        
        int[] dist = new int[y + 1];
        Arrays.fill(dist, -1);
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        dist[x] = 0;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            if (current == y) {
                return dist[current];
            }
            
            int[] next = {
                current + n,
                current * 2,
                current * 3
            };
            
            for (int num : next) {
                if (num <= y && dist[num] == -1) {
                    dist[num] = dist[current] + 1;
                    queue.offer(num);
                }
            }
        }
        return -1;
    }
}