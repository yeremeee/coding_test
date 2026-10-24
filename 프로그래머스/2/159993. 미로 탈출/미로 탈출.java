
import java.util.*;

class Solution {
    public int solution(String[] maps) {

        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (maps[i].charAt(j) == 'S') {
                    start[0] = i;
                    start[1] = j;
                } else if (maps[i].charAt(j) == 'L') {
                    lever[0] = i;
                    lever[1] = j;
                } else if (maps[i].charAt(j) == 'E') {
                    exit[0] = i;
                    exit[1] = j;
                }
            }
        }

        int toLever = bfs(maps, start, lever);

        if (toLever == -1) {
            return -1;
        }

        int toExit = bfs(maps, lever, exit);

        if (toExit == -1) {
            return -1;
        }

        return toLever + toExit;
    }

    public int bfs(String[] maps, int[] start, int[] target) {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);

        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        visited[start[0]][start[1]] = true;

        int[][] dist = new int[maps.length][maps[0].length()];

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] loc = queue.poll();
            int x = loc[0];
            int y = loc[1];

            if (x == target[0] && y == target[1]) {
                return dist[x][y];
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < maps.length &&
                    ny >= 0 && ny < maps[0].length() &&
                    maps[nx].charAt(ny) != 'X' &&
                    !visited[nx][ny]) {

                    visited[nx][ny] = true;
                    dist[nx][ny] = dist[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        return -1;
    }
}
