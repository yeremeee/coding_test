class Solution {
    int answer = 0;
    int[] queens;
    
    public int solution(int n) {
        queens = new int[n];
        dfs(0, n);
        
        return answer;
    }
    
    public boolean isValid(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col) {
                return false;
            }
            
            if (Math.abs(row - i) == Math.abs(col - queens[i])) {
                return false;
            }
        }

        return true;
    }
    
    public void dfs(int row, int n) {
        if (row == n) {
            answer++;
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (isValid(row, col)) {
                queens[row] = col;
                dfs(row + 1, n);
            }
        }
    }
}