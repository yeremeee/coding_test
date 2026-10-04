import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        List<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        for (int i = 0; i < wires.length; i++) {
            int cutA = wires[i][0];
            int cutB = wires[i][1];
            
            boolean[] visited = new boolean[n + 1];
            
            int count = dfs(cutA, graph, visited, cutA, cutB);
            int other = n - count;
            
            int diff = Math.abs(count - other);
            
            answer = Math.min(answer, diff);
        }
        return answer;
    }
    
    public int dfs(int current,
                   List<Integer>[] graph,
                   boolean[] visited,
                   int cutA,
                   int cutB) {
        visited[current] = true;

        int count = 1;

        for (int next : graph[current]) {
            if (visited[next]) {
                continue;
            }
            
            if ((current == cutA && next == cutB) ||
                (current == cutB && next == cutA)) {
                continue;
            }
            
            count += dfs(next, graph, visited, cutA, cutB);
        }

        return count;
    }
}