class Solution
{
    public int solution(int [][]board)
    {
        int height = board.length; 
        int width = board[0].length;
        int[][] dp = new int[height][width];
        int max = 0;
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == 0) {
                    dp[i][j] = 0;
                } else if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = Math.min(
                        dp[i - 1][j - 1],
                        Math.min(dp[i - 1][j], dp[i][j - 1])
                    ) + 1;
                }
                
                max = Math.max(max, dp[i][j]);
            }
        }  
        
        return max * max;
    }

}