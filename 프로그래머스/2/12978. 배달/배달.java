import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        List<List<int[]>> graph = new ArrayList<>();
        
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] r : road) {
            int a = r[0];
            int b = r[1];
            int cost = r[2];
            
            graph.get(a).add(new int[]{b, cost});
            graph.get(b).add(new int[]{a, cost});
        }
        
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        );
        
        pq.offer(new int[]{1, 0});
        
        while (!pq.isEmpty()) {

            int[] current = pq.poll();

            int currentNode = current[0];
            int currentCost = current[1];

            if (currentCost > dist[currentNode]) {
                continue;
            }

            for (int[] next : graph.get(currentNode)) {

                int nextNode = next[0];
                int cost = next[1];

                int newCost = currentCost + cost;

                if (newCost < dist[nextNode]) {
                    dist[nextNode] = newCost;
                    pq.offer(new int[]{nextNode, newCost});
                }
            }
        }
        
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) {
                answer++;
            }
        }

        return answer;
    }
}