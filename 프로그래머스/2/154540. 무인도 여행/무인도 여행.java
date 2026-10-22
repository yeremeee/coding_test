import java.util.*;

class Solution {
    boolean[][] visited;
    String[] maps;

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int[] solution(String[] maps) {
        this.maps = maps;
        visited = new boolean[maps.length][maps[0].length()];

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (!visited[i][j] && maps[i].charAt(j) != 'X') {
                    result.add(dfs(i, j));
                }
            }
        }
        
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        Collections.sort(result);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int dfs(int x, int y) {
        visited[x][y] = true;
        int food = maps[x].charAt(y) - '0';
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if ((nx < maps.length && nx >= 0 && ny < maps[0].length() && ny >= 0)
                && maps[nx].charAt(ny) != 'X' 
                && visited[nx][ny] == false) {
                food += dfs(nx, ny);
            }
        }
        
        return food;
    }
}