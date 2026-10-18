class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        
        int upH = h - 1 < 0 ? -1 : h - 1;
        int upW = w;
        
        int downH = h + 1 >= board.length ? -1 : h + 1;
        int downW = w;
        
        int leftH = h;
        int leftW = w - 1 < 0 ? -1 : w - 1;
        
        int rightH = h;
        int rightW = w + 1 >= board[0].length ? -1 : w + 1;
        
        if (upH != -1 && board[upH][upW].equals(color)) {
            answer++;
        }
        
        if (downH != -1 && board[downH][downW].equals(color)) {
           answer++;
        }
        
        if (leftW != -1 && board[leftH][leftW].equals(color)) {
            answer++;
        }
        
        if (rightW != -1 && board[rightH][rightW].equals(color)) {
            answer++;
        }
        
        return answer;
    }
}