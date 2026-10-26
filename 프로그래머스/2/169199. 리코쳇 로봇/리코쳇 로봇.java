import java.util.*;

class Solution {
    public int solution(String[] board) {
        int answer = 0;
        int[] start = new int[2];
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                if (board[i].charAt(j) == 'R') {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[board.length][board[0].length()];
        
        queue.offer(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            int x = current[0];
            int y = current[1];
            int count = current[2];
            
            if (board[x].charAt(y) == 'G') {
                return count;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x;
                int ny = y;
                
                while (true) {
                    int nextX = nx + dx[i];
                    int nextY = ny + dy[i];
                    
                    if (nextX < 0 || nextX >= board.length ||
                        nextY < 0 || nextY >= board[0].length() ||
                        board[nextX].charAt(nextY) == 'D') {
                        break;
                    }
                    
                    nx = nextX;
                    ny = nextY;
                }
                
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, count + 1});
                }
            }
        }
        
        return -1;
    }
}