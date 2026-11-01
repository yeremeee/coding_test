import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] distance = new int[n][m];
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        distance[0][0] = 1;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (!(nx < 0 || nx > n - 1) &&
                   !(ny < 0 || ny > m - 1) &&
                   maps[nx][ny] == 1 &&
                   distance[nx][ny] == 0) {
                    queue.offer(new int[]{nx, ny});
                    distance[nx][ny] = distance[x][y] + 1;
                }
            }
        }
        
        if (distance[n - 1][m - 1] == 0) {
            return -1;
        }

        return distance[n - 1][m - 1];

    }
}